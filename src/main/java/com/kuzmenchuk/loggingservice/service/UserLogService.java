package com.kuzmenchuk.loggingservice.service;

import com.kuzmenchuk.loggingservice.repostitory.IUserLogRepository;
import com.kuzmenchuk.loggingservice.repostitory.model.UserLogEntity;
import com.kuzmenchuk.loggingservice.repostitory.model.dto.UserLogDTO;
import com.kuzmenchuk.loggingservice.service.interfaces.IUserLogService;
import com.kuzmenchuk.loggingservice.util.enums.EntityType;
import com.kuzmenchuk.loggingservice.util.enums.OperationType;
import com.kuzmenchuk.loggingservice.util.enums.UpdatedField;
import com.kuzmenchuk.loggingservice.util.mapper.EntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserLogService implements IUserLogService {
    private final IUserLogRepository userLogRepository;

    @Override
    public UserLogDTO addToLog(UserLogDTO entityDTO) {
        UserLogEntity userLog = UserLogEntity.userLogEntityBuilder()
                .userID(entityDTO.getUserID())
                .entityType(EntityType.USER)
                .operationType(OperationType.INSERT)
                .updatedField(UpdatedField.NEW)
                .oldValue(null)
                .newValue(null)
                .updatingUserID(entityDTO.getUpdatingUserID())
                .updatingDate(LocalDateTime.now())
                .build();

        return EntityMapper.fromEntityToDTO(userLogRepository.saveAndFlush(userLog));
    }

    @Override
    public void deleteFromLog() {

    }

    @Override
    public UserLogDTO getLogByID(Long logID) {
        return EntityMapper.fromEntityToDTO(userLogRepository.findById(logID).get());
    }

    @Override
    public List<UserLogDTO> getAllLogs() {
        List<UserLogEntity> userLogList = userLogRepository.findAll();
        return userLogList.stream()
                .map(EntityMapper::fromEntityToDTO)
                .collect(Collectors.toList());
    }
}
