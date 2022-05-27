package com.kuzmenchuk.loggingservice.service;

import com.kuzmenchuk.loggingservice.repostitory.ITestResultLogRepository;
import com.kuzmenchuk.loggingservice.repostitory.model.TestResultLogEntity;
import com.kuzmenchuk.loggingservice.repostitory.model.dto.TestResultLogDTO;
import com.kuzmenchuk.loggingservice.service.interfaces.ITestResultLogService;
import com.kuzmenchuk.loggingservice.util.mapper.EntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class TestResultLogService implements ITestResultLogService {
    private final ITestResultLogRepository testResultLogRepository;

    @Override
    public TestResultLogDTO addToLog(TestResultLogDTO entityDTO) {
        return TestResultLogDTO.testResultLogDTOBuilder().build();
    }

    @Override
    public void deleteFromLog() {

    }

    @Override
    public TestResultLogDTO getLogByID(Long logID) {
        return EntityMapper.fromEntityToDTO(testResultLogRepository.findById(logID).get());
    }

    @Override
    public List<TestResultLogDTO> getAllLogs() {
        List<TestResultLogEntity> testResultLogList = testResultLogRepository.findAll();
        return testResultLogList.stream()
                .map(EntityMapper::fromEntityToDTO)
                .collect(Collectors.toList());
    }
}

