package com.lesson7.domain;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;

public class ChatEntity {
    private Long id;
    private List<MessageEntity> messageList;
    private Set<UserEntity> users;
    private ZonedDateTime createdDateTime;
}
