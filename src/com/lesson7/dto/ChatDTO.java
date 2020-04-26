package com.lesson7.dto;

import java.util.List;
import java.util.Set;

public class ChatDTO {
    private Long id;
    private List<MessageDTO> messageList;
    private Set<UserDTO> userSet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<MessageDTO> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<MessageDTO> messageList) {
        this.messageList = messageList;
    }

    public Set<UserDTO> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<UserDTO> userSet) {
        this.userSet = userSet;
    }
}
