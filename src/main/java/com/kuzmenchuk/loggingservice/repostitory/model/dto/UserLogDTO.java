package com.kuzmenchuk.loggingservice.repostitory.model.dto;

import com.kuzmenchuk.loggingservice.util.enums.EntityType;
import com.kuzmenchuk.loggingservice.util.enums.OperationType;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserLogDTO extends LogBaseDTO {
    private Long userID;
    private String updatedField;
    private String oldValue;
    private String newValue;

    @Builder(builderMethodName = "userLogDTOBuilder")
    public UserLogDTO(Long logID, OperationType operationType, EntityType entityType, Long updatingUserID,
                      LocalDateTime updatingDate, Long userID, String updatedField, String oldValue, String newValue) {
        super(logID, operationType, entityType, updatingUserID, updatingDate);
        this.userID = userID;
        this.updatedField = updatedField;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }
}
