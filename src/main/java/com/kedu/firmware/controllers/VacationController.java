package com.kedu.firmware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kedu.firmware.DTO.UsersDTO;
import com.kedu.firmware.DTO.VacationApplicationDTO;
import com.kedu.firmware.services.VacationService;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/vacation")
public class VacationController {

    @Autowired
    private VacationService vacationService;

    // 로그인 후 휴가 상태 체크 및 휴가 지급 처리
    @PostMapping("/check")
    public ResponseEntity<Map<String, String>> checkVacation(@RequestBody Map<String, Object> payload) {
        Map<String, String> response = new HashMap<>();
        
        int usersSeq = (Integer) payload.get("users_seq");
        String joinDateStr = (String) payload.get("joinDate");

        LocalDate joinDate = joinDateStr != null ? LocalDate.parse(joinDateStr.substring(0, 10)) : null;  // 문자열로 받은 입사일을 LocalDate로 변환

        // 해당 사용자가 이미 연차를 부여받았는지 확인
        boolean hasVacation = vacationService.hasVacation(usersSeq);

        if (!hasVacation && joinDate != null) {
            // 첫 로그인 시 연차 부여
            vacationService.allocateVacation(usersSeq, joinDate);
            response.put("message", "휴가가 지급되었습니다");
        } else if (hasVacation) {
            // 이미 연차가 있을 경우 잔여 연차 확인
            response.put("message", "잔여 휴가 체크 완료");
        } else {
            // 연차 지급 정보가 없고, joinDate가 null인 경우에 대한 처리
            response.put("message", "연차 지급 정보가 없습니다.");
        }

        return ResponseEntity.ok(response);
    }




    // 휴가 신청 처리
    @PostMapping("/apply")
    public ResponseEntity<String> applyVacation(@RequestBody VacationApplicationDTO vacationApplication) {
        vacationService.applyForVacation(vacationApplication);
        return ResponseEntity.ok("휴가 신청이 완료되었습니다.");
    }

    // 휴가 신청 내역 조회
    @GetMapping("/applications/{userSeq}")
    public ResponseEntity<List<VacationApplicationDTO>> getVacationApplications(@PathVariable int userSeq) {
        List<VacationApplicationDTO> applications = vacationService.getVacationApplicationsByUser(userSeq);
        return ResponseEntity.ok(applications);
    }

    // 휴가 승인 처리
    @PostMapping("/approve/{vacationApplicationSeq}")
    public ResponseEntity<String> approveVacation(@PathVariable int vacationApplicationSeq) {
        vacationService.approveVacation(vacationApplicationSeq);
        return ResponseEntity.ok("휴가가 승인되었습니다.");
    }

    // 특정 기간 동안의 휴가 조회
    @GetMapping("/by-date-range")
    public ResponseEntity<List<VacationApplicationDTO>> getVacationByDateRange(
            @RequestParam int userSeq, 
            @RequestParam String startDate, 
            @RequestParam String endDate) {
        List<VacationApplicationDTO> vacations = vacationService.getVacationByDateRange(userSeq, startDate, endDate);
        return ResponseEntity.ok(vacations);
    }
}
