package com.kedu.firmware.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedu.firmware.DAO.AttendanceDAO;
import com.kedu.firmware.DTO.AttendanceDTO;

@Service
public class AttendanceService {

	@Autowired
	private AttendanceDAO attendancedao;
	
	public void insertCheckInTime(AttendanceDTO attendancedto) {
		attendancedao.insertCheckInTime(attendancedto);
	}

	public void insertCheckOutTime(AttendanceDTO attendancedto) {
		attendancedao.insertCheckOutTime(attendancedto);
	}
	
	public AttendanceDTO checkIfAlreadyCheckedIn(int users_seq) {
		return attendancedao.checkIfAlreadyCheckedIn(users_seq);
	}
	
	public List<AttendanceDTO> getAttendanceEvents(int usersSeq, String startDate, String endDate) {
        return attendancedao.getAttendanceEvents(usersSeq, startDate, endDate);
    }
	
	
}
