package com.kuzmenchuk.loggingservice.repostitory.model;

import com.kuzmenchuk.loggingservice.util.enums.EntityType;
import com.kuzmenchuk.loggingservice.util.enums.OperationType;
import com.kuzmenchuk.loggingservice.util.enums.UpdatedField;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "test_log")
public class TestLogEntity extends LogBaseEntity {
    @Column(name = "test_id")
    private Long testID;

    @Column(name = "updated_field")
    @Enumerated(EnumType.STRING)
    private UpdatedField updatedField;

    @Column(name = "old_value")
    private String oldValue;

    @Column(name = "new_value")
    private String newValue;

    @Builder(builderMethodName = "testLogEntityBuilder")
    public TestLogEntity(Long logID, Integer version, OperationType operationType, EntityType entityType,
                         Long updatingUserID, LocalDateTime updatingDate, Long testID, UpdatedField updatedField, String oldValue, String newValue) {
        super(logID, version, operationType, entityType, updatingUserID, updatingDate);
        this.testID = testID;
        this.updatedField = updatedField;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }
}
