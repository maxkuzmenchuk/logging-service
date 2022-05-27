package com.kuzmenchuk.loggingservice.util.mapper;

import com.kuzmenchuk.loggingservice.repostitory.model.FileLogEntity;
import com.kuzmenchuk.loggingservice.repostitory.model.TestLogEntity;
import com.kuzmenchuk.loggingservice.repostitory.model.TestResultLogEntity;
import com.kuzmenchuk.loggingservice.repostitory.model.UserLogEntity;
import com.kuzmenchuk.loggingservice.repostitory.model.dto.FileLogDTO;
import com.kuzmenchuk.loggingservice.repostitory.model.dto.TestLogDTO;
import com.kuzmenchuk.loggingservice.repostitory.model.dto.TestResultLogDTO;
import com.kuzmenchuk.loggingservice.repostitory.model.dto.UserLogDTO;

public class EntityMapper {
    public static UserLogDTO fromEntityToDTO(UserLogEntity logEntity) {
        return UserLogDTO.userLogDTOBuilder()
                .logID(logEntity.getLogID())
                .userID(logEntity.getUserID())
                .operationType(logEntity.getOperationType())
                .entityType(logEntity.getEntityType())
                .updatedField(logEntity.getUpdatedField())
                .oldValue(logEntity.getOldValue())
                .newValue(logEntity.getNewValue())
                .updatingDate(logEntity.getUpdatingDate())
                .updatingUserID(logEntity.getUpdatingUserID())
                .build();
    }

    public static UserLogEntity fromDtoToEntity(UserLogDTO logDTO) {
        return UserLogEntity.userLogEntityBuilder()
                .logID(logDTO.getLogID())
                .userID(logDTO.getUserID())
                .operationType(logDTO.getOperationType())
                .entityType(logDTO.getEntityType())
                .updatedField(logDTO.getUpdatedField())
                .oldValue(logDTO.getOldValue())
                .newValue(logDTO.getNewValue())
                .updatingDate(logDTO.getUpdatingDate())
                .updatingUserID(logDTO.getUpdatingUserID())
                .build();
    }

    public static TestLogDTO fromEntityToDTO(TestLogEntity logEntity) {
        return TestLogDTO.testLogDTOBuilder()
                .logID(logEntity.getLogID())
                .testID(logEntity.getTestID())
                .operationType(logEntity.getOperationType())
                .entityType(logEntity.getEntityType())
                .updatedField(logEntity.getUpdatedField())
                .oldValue(logEntity.getOldValue())
                .newValue(logEntity.getNewValue())
                .updatingDate(logEntity.getUpdatingDate())
                .updatingUserID(logEntity.getUpdatingUserID())
                .build();
    }

    public static TestLogEntity fromDtoToEntity(TestLogDTO logDTO) {
        return TestLogEntity.testLogEntityBuilder()
                .logID(logDTO.getLogID())
                .testID(logDTO.getTestID())
                .operationType(logDTO.getOperationType())
                .entityType(logDTO.getEntityType())
                .updatedField(logDTO.getUpdatedField())
                .oldValue(logDTO.getOldValue())
                .newValue(logDTO.getNewValue())
                .updatingDate(logDTO.getUpdatingDate())
                .updatingUserID(logDTO.getUpdatingUserID())
                .build();
    }

    public static TestResultLogDTO fromEntityToDTO(TestResultLogEntity logEntity) {
        return TestResultLogDTO.testResultLogDTOBuilder()
                .logID(logEntity.getLogID())
                .testID(logEntity.getTestID())
                .operationType(logEntity.getOperationType())
                .entityType(logEntity.getEntityType())
                .updatingDate(logEntity.getUpdatingDate())
                .updatingUserID(logEntity.getUpdatingUserID())
                .build();
    }

    public static TestResultLogEntity fromDtoToEntity(TestResultLogDTO logDTO) {
        return TestResultLogEntity.testResultLogEntityBuilder()
                .logID(logDTO.getLogID())
                .testID(logDTO.getTestID())
                .operationType(logDTO.getOperationType())
                .entityType(logDTO.getEntityType())
                .updatingDate(logDTO.getUpdatingDate())
                .updatingUserID(logDTO.getUpdatingUserID())
                .build();
    }

    public static FileLogDTO fromEntityToDTO(FileLogEntity logEntity) {
        return FileLogDTO.fileLogDTOBuilder()
                .logID(logEntity.getLogID())
                .testID(logEntity.getTestID())
                .operationType(logEntity.getOperationType())
                .entityType(logEntity.getEntityType())
                .updatingDate(logEntity.getUpdatingDate())
                .updatingUserID(logEntity.getUpdatingUserID())
                .build();
    }

    public static FileLogEntity fromDtoToEntity(FileLogDTO logDTO) {
        return FileLogEntity.fileLogEntityBuilder()
                .logID(logDTO.getLogID())
                .testID(logDTO.getTestID())
                .operationType(logDTO.getOperationType())
                .entityType(logDTO.getEntityType())
                .updatingDate(logDTO.getUpdatingDate())
                .updatingUserID(logDTO.getUpdatingUserID())
                .build();
    }
}
