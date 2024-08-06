package com.kedu.firmware.DTO;

import java.sql.Timestamp;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacationApplicationDTO {
	private int vacation_application_seq;
	private int vacation_drafter_user_seq;
	private int vacation_type_seq;
	private int vacation_permession_user_seq;
	private Timestamp vacation_start_date;
	private Timestamp vacation_end_date;
	private Timestamp vaction_application_date;
	private char vacation_application_status;
	private String vacation_application_reason;
}
