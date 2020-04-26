package com.lesson7.repository;

import com.lesson7.domain.ChatEntity;

public interface ChatRepository {
    ChatEntity getById(long id);

    ChatEntity save(ChatEntity e);

    ChatEntity deleteById(long id);

    ChatEntity delete(ChatEntity e);
}
