package com.kuzmenchuk.loggingservice.repostitory.model;

import com.kuzmenchuk.loggingservice.util.enums.EntityType;
import com.kuzmenchuk.loggingservice.util.enums.OperationType;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
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
    private String updatedField;

    @Column(name = "old_value")
    private String oldValue;

    @Column(name = "new_value")
    private String newValue;

    @Builder(builderMethodName = "testLogEntityBuilder")
    public TestLogEntity(Long logID, Integer version, OperationType operationType, EntityType entityType,
                         Long updatingUserID, LocalDateTime updatingDate, Long testID, String updatedField, String oldValue, String newValue) {
        super(logID, version, operationType, entityType, updatingUserID, updatingDate);
        this.testID = testID;
        this.updatedField = updatedField;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }
}
