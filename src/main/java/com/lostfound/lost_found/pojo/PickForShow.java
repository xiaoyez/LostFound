package com.lostfound.lost_found.pojo;

public class PickForShow {
    private User pickUser;
    private PickInformation pickInformation;

    public PickForShow(PickInformation pickInformation) {
        this.pickInformation = pickInformation;
    }

    public User getPickUser() {
        return pickUser;
    }

    public void setPickUser(User pickUser) {
        this.pickUser = pickUser;
    }

    public PickInformation getPickInformation() {
        return pickInformation;
    }

    public void setPickInformation(PickInformation pickInformation) {
        this.pickInformation = pickInformation;
    }

    @Override
    public String toString() {
        return "PickForShow{" +
                "pickUser=" + pickUser +
                ", pickInformation=" + pickInformation +
                '}';
    }
}
