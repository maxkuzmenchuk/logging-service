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
@Table(name = "user_log")
public class UserLogEntity extends LogBaseEntity {
    @Column(name = "user_id")
    private Long userID;

    @Column(name = "updated_field")
    @Enumerated(EnumType.STRING)
    private UpdatedField updatedField;

    @Column(name = "old_value")
    private String oldValue;

    @Column(name = "new_value")
    private String newValue;


    @Builder(builderMethodName = "userLogEntityBuilder")
    public UserLogEntity(Long logID, Integer version, OperationType operationType, EntityType entityType,
                         Long updatingUserID, LocalDateTime updatingDate, Long userID, UpdatedField updatedField, String oldValue, String newValue) {
        super(logID, version, operationType, entityType, updatingUserID, updatingDate);
        this.userID = userID;
        this.updatedField = updatedField;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }
}
