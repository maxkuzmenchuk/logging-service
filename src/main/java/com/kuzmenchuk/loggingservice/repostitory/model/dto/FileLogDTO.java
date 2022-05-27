package com.kuzmenchuk.loggingservice.repostitory.model.dto;

import com.kuzmenchuk.loggingservice.util.enums.EntityType;
import com.kuzmenchuk.loggingservice.util.enums.FileKind;
import com.kuzmenchuk.loggingservice.util.enums.OperationType;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FileLogDTO extends LogBaseDTO {
    private Long testID;
    private FileKind fileKind;

    @Builder(builderMethodName = "fileLogDTOBuilder")
    public FileLogDTO(Long logID, OperationType operationType, EntityType entityType, Long updatingUserID,
                      LocalDateTime updatingDate, Long testID, FileKind fileKind) {
        super(logID, operationType, entityType, updatingUserID, updatingDate);
        this.testID = testID;
        this.fileKind = fileKind;
    }
}
