package com.lostfound.lost_found.pojo;

import java.util.Date;

public class PickInformation extends PickInformationKey {

    private Integer userId;

    private String pickName;

    private String pickType;

    private Date pickDate;

    private String pickPlace;

    private String pickPhone;

    private Date reportDate;

    private String pickTrait;

    public String getPickName() {
        return pickName;
    }

    public void setPickName(String pickName) {
        this.pickName = pickName == null ? null : pickName.trim();
    }

    public String getPickType() {
        return pickType;
    }

    public void setPickType(String pickType) {
        this.pickType = pickType == null ? null : pickType.trim();
    }

    public Date getPickDate() {
        return pickDate;
    }

    public void setPickDate(Date pickDate) {
        this.pickDate = pickDate;
    }

    public String getPickPlace() {
        return pickPlace;
    }

    public void setPickPlace(String pickPlace) {
        this.pickPlace = pickPlace == null ? null : pickPlace.trim();
    }

    public String getPickPhone() {
        return pickPhone;
    }

    public void setPickPhone(String pickPhone) {
        this.pickPhone = pickPhone == null ? null : pickPhone.trim();
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getPickTrait() {
        return pickTrait;
    }

    public void setPickTrait(String pickTrait) {
        this.pickTrait = pickTrait == null ? null : pickTrait.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "PickInformation{" +
                "userId=" + userId +
                ", pickName='" + pickName + '\'' +
                ", pickType='" + pickType + '\'' +
                ", pickDate=" + pickDate +
                ", pickPlace='" + pickPlace + '\'' +
                ", pickPhone='" + pickPhone + '\'' +
                ", reportDate=" + reportDate +
                ", pickTrait='" + pickTrait + '\'' +
                '}';
    }
}