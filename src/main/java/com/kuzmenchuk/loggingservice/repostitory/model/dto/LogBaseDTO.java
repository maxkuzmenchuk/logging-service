package com.kuzmenchuk.loggingservice.repostitory.model.dto;

import com.kuzmenchuk.loggingservice.util.enums.EntityType;
import com.kuzmenchuk.loggingservice.util.enums.OperationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@MappedSuperclass
public class LogBaseDTO implements Serializable {
    private Long logID;
    private OperationType operationType;
    private EntityType entityType;
    private Long updatingUserID;
    private LocalDateTime updatingDate;
}

