package com.kuzmenchuk.loggingservice.service;

import com.kuzmenchuk.loggingservice.repostitory.model.dto.TestResultLogDTO;
import com.kuzmenchuk.loggingservice.service.interfaces.ITestResultLogService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestResultLogService implements ITestResultLogService {
    @Override
    public void addToLog(TestResultLogDTO entityDTO) {

    }

    @Override
    public void deleteFromLog() {

    }

    @Override
    public Optional<TestResultLogDTO> getLogByID(Long logID) {
        return Optional.empty();
    }
}
