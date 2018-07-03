package com.lostfound.lost_found.pojo;

import java.util.Date;

public class MessageForShow {

    private Integer messageId;

    private User sender;

    private User receiver;

    private String context;

    private String date;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MessageForShow{" +
                "messageId=" + messageId +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", context='" + context + '\'' +
                ", date=" + date +
                '}';
    }
}
