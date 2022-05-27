package com.kuzmenchuk.loggingservice.service;

import com.kuzmenchuk.loggingservice.repostitory.model.dto.TestLogDTO;
import com.kuzmenchuk.loggingservice.service.interfaces.ITestLogService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestLogService implements ITestLogService {
    @Override
    public void addToLog(TestLogDTO entityDTO) {

    }

    @Override
    public void deleteFromLog() {

    }

    @Override
    public Optional<TestLogDTO> getLogByID(Long logID) {
        return Optional.empty();
    }
}
