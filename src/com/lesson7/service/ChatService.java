package com.lesson7.service;

import com.lesson7.dto.ChatDTO;
import com.lesson7.dto.FileItemDTO;
import com.lesson7.dto.MessageDTO;
import com.lesson7.dto.NewMessageDTO;
import com.lesson7.exception.ChatNotFound;

import java.util.Collection;

public interface ChatService {
    ChatDTO get(long id);

    ChatDTO create(long userId);

    MessageDTO addMessage(NewMessageDTO message);

    MessageDTO addMessage(NewMessageDTO message, Collection<FileItemDTO> files);

    void finish(long id) throws ChatNotFound;
}
