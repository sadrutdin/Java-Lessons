package com.lesson7.repository;

import com.lesson7.domain.FileEntity;

import java.util.Collection;
import java.util.List;

public interface FileRepository {
    FileEntity add(FileEntity file);

    List<FileEntity> addAll(Collection<FileEntity> files);
}
