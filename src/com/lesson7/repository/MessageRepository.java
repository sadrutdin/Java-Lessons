package com.lesson7.repository;

import com.lesson7.domain.ChatEntity;
import com.lesson7.domain.MessageEntity;

public interface MessageRepository {
    MessageEntity addMessage(MessageEntity e);
}
