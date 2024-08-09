package com.kedu.firmware.controllers;

import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kedu.firmware.DTO.AttendanceDTO;
import com.kedu.firmware.services.AttendanceService;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceServ;

    @PostMapping
    public ResponseEntity<String> handleAttendance(@RequestBody AttendanceDTO attendancedto) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

            if (attendancedto.getCheck_in_time() != null) {
                // check_in_time을 Timestamp로 직접 설정
                Timestamp checkInTimestamp = Timestamp.valueOf(attendancedto.getCheck_in_time().toString());
                System.out.println(checkInTimestamp);
                attendancedto.setCheck_in_time(checkInTimestamp);

                attendanceServ.insertCheckInTime(attendancedto);
                return ResponseEntity.ok("출석 기록 성공");
            }

            if (attendancedto.getCheck_out_time() != null) {
                // check_out_time을 Timestamp로 직접 설정
                Timestamp checkOutTimestamp = Timestamp.valueOf(attendancedto.getCheck_out_time().toString());
                attendancedto.setCheck_out_time(checkOutTimestamp);

                attendanceServ.insertCheckOutTime(attendancedto);
                return ResponseEntity.ok("퇴근 기록 성공");
            }

            return ResponseEntity.badRequest().body("Invalid request");

        } catch (Exception e) {
            e.printStackTrace(); // 서버 로그에 예외 메시지를 출력
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("서버에서 오류가 발생했습니다: " + e.getMessage());
        }
    }
    
    
    @GetMapping("/events")
    public ResponseEntity<List<AttendanceDTO>> getAttendanceEvents(
            @RequestParam("users_seq") int usersSeq,
            @RequestParam("start_date") String startDate,
            @RequestParam("end_date") String endDate) {
        List<AttendanceDTO> events = attendanceServ.getAttendanceEvents(usersSeq, startDate, endDate);
        
        for (AttendanceDTO event : events) {
            System.out.println("Attendance ID: " + event.getAttendance_id());
            System.out.println("User Seq: " + event.getUsers_seq());
            System.out.println("Attendance Date: " + event.getAttendance_date());
            System.out.println("Check-In Time: " + event.getCheck_in_time());
            System.out.println("Check-Out Time: " + event.getCheck_out_time());
            System.out.println("Status: " + event.getStatus());
            System.out.println("-------------------------------");
        }
        
        return ResponseEntity.ok(events);
    }
    
    
    @GetMapping("/check")
    public ResponseEntity<Map<String, Object>> checkAttendanceStatus(@RequestParam("users_seq") int usersSeq) {
        AttendanceDTO attendance = attendanceServ.checkIfAlreadyCheckedIn(usersSeq);
        
        Map<String, Object> response = new HashMap<>();
        response.put("checkIn", attendance.getCheck_in_time());
        response.put("checkOut", attendance.getCheck_out_time());
        
        return ResponseEntity.ok(response);
    }
    
    
    
    
}
