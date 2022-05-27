package com.kuzmenchuk.loggingservice.service;

import com.kuzmenchuk.loggingservice.repostitory.model.dto.FileLogDTO;
import com.kuzmenchuk.loggingservice.service.interfaces.IFileLogService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FileLogService implements IFileLogService {
    @Override
    public void addToLog(FileLogDTO entityDTO) {

    }

    @Override
    public void deleteFromLog() {

    }

    @Override
    public Optional<FileLogDTO> getLogByID(Long logID) {
        return Optional.empty();
    }
}
