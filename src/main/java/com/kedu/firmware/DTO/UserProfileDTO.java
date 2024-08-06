package com.kedu.firmware.DTO;

public class UserProfileDTO {
    private Long userProfileSeq; // user_profile_seq: 기본 키
    private Long userSeq; // user_seq: 사용자를 참조하는 외래 키
    private String phoneNumber; // phone_number: 전화번호
    private String address; // address: 주소
    private String profilePictureUrl; // profile_picture_url: 프로필 사진 URL
    private String rank; // rank: 직책
    private String employeeId; // employee_id: 사번
    private String joinDate; // join_date: 입사일
    private String email; // email: 이메일

    // 기본 생성자
    public UserProfileDTO() {}

    // 모든 필드를 포함한 생성자
    public UserProfileDTO(Long userProfileSeq, Long userSeq, String phoneNumber, String address, String profilePictureUrl, String rank, String employeeId, String joinDate, String email) {
        this.userProfileSeq = userProfileSeq;
        this.userSeq = userSeq;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.profilePictureUrl = profilePictureUrl;
        this.rank = rank;
        this.employeeId = employeeId;
        this.joinDate = joinDate;
        this.email = email;
    }

    // Getter 및 Setter 메소드
    public Long getUserProfileSeq() {
        return userProfileSeq;
    }

    public void setUserProfileSeq(Long userProfileSeq) {
        this.userProfileSeq = userProfileSeq;
    }

    public Long getUserSeq() {
        return userSeq;
    }

    public void setUserSeq(Long userSeq) {
        this.userSeq = userSeq;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
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

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
