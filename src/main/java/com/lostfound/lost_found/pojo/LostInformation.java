package com.lostfound.lost_found.pojo;

import java.util.Date;

public class LostInformation extends LostInformationKey {
    private Integer userId;

    private String lostName;

    private String lostType;

    private Date lostDate;

    private String lostPlace;

    private String lostPhone;

    private Date reportDate;

    private String lostTrait;

    public String getLostName() {
        return lostName;
    }

    public void setLostName(String lostName) {
        this.lostName = lostName == null ? null : lostName.trim();
    }

    public String getLostType() {
        return lostType;
    }

    public void setLostType(String lostType) {
        this.lostType = lostType == null ? null : lostType.trim();
    }

    public Date getLostDate() {
        return lostDate;
    }

    public void setLostDate(Date lostDate) {
        this.lostDate = lostDate;
    }

    public String getLostPlace() {
        return lostPlace;
    }

    public void setLostPlace(String lostPlace) {
        this.lostPlace = lostPlace == null ? null : lostPlace.trim();
    }

    public String getLostPhone() {
        return lostPhone;
    }

    public void setLostPhone(String lostPhone) {
        this.lostPhone = lostPhone == null ? null : lostPhone.trim();
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getLostTrait() {
        return lostTrait;
    }

    public void setLostTrait(String lostTrait) {
        this.lostTrait = lostTrait == null ? null : lostTrait.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}