package com.lesson7.dto;

public class NewMessageDTO {
    private boolean publicMessage;
    private String name;

    public boolean isPublicMessage() {
        return publicMessage;
    }

    public void setPublicMessage(boolean publicMessage) {
        this.publicMessage = publicMessage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
