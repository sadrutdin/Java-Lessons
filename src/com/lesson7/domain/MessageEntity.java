package com.lesson7.domain;

import java.util.List;

public class MessageEntity {
    private Long id;
    private UserEntity author;
    private ChatEntity chat;
    private String text;
    private List<FileEntity> fileList;
}
