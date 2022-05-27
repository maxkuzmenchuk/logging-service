package com.kuzmenchuk.loggingservice.repostitory.model.dto;

import com.kuzmenchuk.loggingservice.util.enums.EntityType;
import com.kuzmenchuk.loggingservice.util.enums.OperationType;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestLogDTO extends LogBaseDTO {
    private Long testID;
    private String updatedField;
    private String oldValue;
    private String newValue;

    @Builder(builderMethodName = "testLogDTOBuilder")
    public TestLogDTO(Long logID, OperationType operationType, EntityType entityType, Long updatingUserID, LocalDateTime updatingDate, Long testID, String updatedField, String oldValue, String newValue) {
        super(logID, operationType, entityType, updatingUserID, updatingDate);
        this.testID = testID;
        this.updatedField = updatedField;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }
}
