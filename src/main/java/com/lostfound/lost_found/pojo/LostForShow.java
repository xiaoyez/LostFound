package com.lostfound.lost_found.pojo;

public class LostForShow{
    private User lostUser;
    private LostInformation lostInformation;

    public LostForShow(LostInformation lostInformation) {
        this.lostInformation = lostInformation;
    }

    public LostInformation getLostInformation() {
        return lostInformation;
    }

    public void setLostInformation(LostInformation lostInformation) {
        this.lostInformation = lostInformation;
    }

    public User getLostUser() {
        return lostUser;
    }

    public void setLostUser(User lostUser) {
        this.lostUser = lostUser;
    }

    @Override
    public String toString() {
        return "LostForShow{" +
                "lostUser=" + lostUser +
                ", lostInformation=" + lostInformation +
                '}';
    }
}
