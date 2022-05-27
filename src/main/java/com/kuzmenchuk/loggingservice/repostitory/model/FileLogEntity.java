package com.kuzmenchuk.loggingservice.repostitory.model;

import com.kuzmenchuk.loggingservice.util.enums.EntityType;
import com.kuzmenchuk.loggingservice.util.enums.FileKind;
import com.kuzmenchuk.loggingservice.util.enums.OperationType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "file_log")
public class FileLogEntity extends LogBaseEntity {
    @Column(name = "test_id")
    private Long testID;

    @Column(name = "file_kind")
    @Enumerated(EnumType.STRING)
    private FileKind fileKind;

    @Builder(builderMethodName = "fileLogEntityBuilder")
    public FileLogEntity(Long logID, Integer version, OperationType operationType, EntityType entityType,
                         Long updatingUserID, LocalDateTime updatingDate, Long testID, FileKind fileKind) {
        super(logID, version, operationType, entityType, updatingUserID, updatingDate);
        this.testID = testID;
        this.fileKind = fileKind;
    }
}
