package com.lesson7.dto;

import java.time.ZonedDateTime;

public class MessageDTO {
    private long id;
    private String text;
    private boolean publicMessage;
    private ZonedDateTime createdDateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isPublicMessage() {
        return publicMessage;
    }

    public void setPublicMessage(boolean publicMessage) {
        this.publicMessage = publicMessage;
    }

    public ZonedDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(ZonedDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
}
