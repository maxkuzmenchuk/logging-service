package com.kuzmenchuk.loggingservice.service;

import com.kuzmenchuk.loggingservice.repostitory.IFileLogRepository;
import com.kuzmenchuk.loggingservice.repostitory.model.FileLogEntity;
import com.kuzmenchuk.loggingservice.repostitory.model.dto.FileLogDTO;
import com.kuzmenchuk.loggingservice.service.interfaces.IFileLogService;
import com.kuzmenchuk.loggingservice.util.mapper.EntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class FileLogService implements IFileLogService {
    private final IFileLogRepository fileLogRepository;

    @Override
    public FileLogDTO addToLog(FileLogDTO entityDTO) {
        return FileLogDTO.fileLogDTOBuilder().build();
    }

    @Override
    public void deleteFromLog() {

    }

    @Override
    public FileLogDTO getLogByID(Long logID) {
        return EntityMapper.fromEntityToDTO(fileLogRepository.findById(logID).get());
    }

    @Override
    public List<FileLogDTO> getAllLogs() {
        List<FileLogEntity> fileLogList = fileLogRepository.findAll();
        return fileLogList.stream()
                .map(EntityMapper::fromEntityToDTO)
                .collect(Collectors.toList());
    }
}
