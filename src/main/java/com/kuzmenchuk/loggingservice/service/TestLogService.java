package com.kuzmenchuk.loggingservice.service;

import com.kuzmenchuk.loggingservice.repostitory.ITestLogRepository;
import com.kuzmenchuk.loggingservice.repostitory.model.TestLogEntity;
import com.kuzmenchuk.loggingservice.repostitory.model.dto.TestLogDTO;
import com.kuzmenchuk.loggingservice.service.interfaces.ITestLogService;
import com.kuzmenchuk.loggingservice.util.mapper.EntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class TestLogService implements ITestLogService {
    private final ITestLogRepository testLogRepository;

    @Override
    public TestLogDTO addToLog(TestLogDTO entityDTO) {
        return TestLogDTO.testLogDTOBuilder().build();
    }

    @Override
    public void deleteFromLog() {

    }

    @Override
    public TestLogDTO getLogByID(Long logID) {
        return EntityMapper.fromEntityToDTO(testLogRepository.findById(logID).get());
    }

    @Override
    public List<TestLogDTO> getAllLogs() {
        List<TestLogEntity> testLogList = testLogRepository.findAll();
        return testLogList.stream()
                .map(EntityMapper::fromEntityToDTO)
                .collect(Collectors.toList());
    }
}
