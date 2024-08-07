package com.kedu.firmware.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Timestamp;

public class UserUpdateRequestesDTO {

    private Long usersUpdateRequestSeq;
    private Long usersSeq;
    private String phoneNumber;
    private String email;
    private String address;
    private String zipCode;
    private String detailedAddress;
    private String requestReason;
    private String requestStatus;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp requestTimestamp;

    private String profileImage;   // 추가된 필드
    private String rank;           // 추가된 필드
    private String employeeId;     // 추가된 필드
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp joinDate;    // 추가된 필드
    
    private String approver;       // 추가된 필드

    public UserUpdateRequestesDTO() {
        super();
    }

    public UserUpdateRequestesDTO(Long usersUpdateRequestSeq, Long usersSeq, String phoneNumber, String email,
                                String address, String zipCode, String detailedAddress, String requestReason, 
                                String requestStatus, Timestamp requestTimestamp, String profileImage, 
                                String rank, String employeeId, Timestamp joinDate, String approver) {
        super();
        this.usersUpdateRequestSeq = usersUpdateRequestSeq;
        this.usersSeq = usersSeq;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.zipCode = zipCode;
        this.detailedAddress = detailedAddress;
        this.requestReason = requestReason;
        this.requestStatus = requestStatus;
        this.requestTimestamp = requestTimestamp;
        this.profileImage = profileImage;
        this.rank = rank;
        this.employeeId = employeeId;
        this.joinDate = joinDate;
        this.approver = approver;
    }

    // Getters and Setters
    public Long getUsersUpdateRequestSeq() {
        return usersUpdateRequestSeq;
    }

    public void setUsersUpdateRequestSeq(Long usersUpdateRequestSeq) {
        this.usersUpdateRequestSeq = usersUpdateRequestSeq;
    }

    public Long getUsersSeq() {
        return usersSeq;
    }

    public void setUsersSeq(Long usersSeq) {
        this.usersSeq = usersSeq;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getRequestReason() {
        return requestReason;
    }

    public void setRequestReason(String requestReason) {
        this.requestReason = requestReason;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public Timestamp getRequestTimestamp() {
        return requestTimestamp;
    }

    public void setRequestTimestamp(Timestamp requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Timestamp getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Timestamp joinDate) {
        this.joinDate = joinDate;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }
}
