package com.kuzmenchuk.loggingservice.service;

import com.kuzmenchuk.loggingservice.repostitory.model.dto.UserLogDTO;
import com.kuzmenchuk.loggingservice.service.interfaces.IUserLogService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserLogService implements IUserLogService {
    @Override
    public void addToLog(UserLogDTO entityDTO) {

    }

    @Override
    public void deleteFromLog() {

    }

    @Override
    public Optional<UserLogDTO> getLogByID(Long logID) {
        return Optional.empty();
    }
}
