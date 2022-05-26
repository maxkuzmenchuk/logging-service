package com.kuzmenchuk.loggingservice.repostitory.model;

import com.kuzmenchuk.loggingservice.util.enums.EntityType;
import com.kuzmenchuk.loggingservice.util.enums.OperationType;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
public class LogBaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Long logID;

    @Version
    private Integer version;

    @Column(name = "operation_type")
    @Enumerated(EnumType.STRING)
    private OperationType operationType;

    @Column(name = "entity_type")
    @Enumerated(EnumType.STRING)
    private EntityType entityType;

    @Column(name = "updating_user_id")
    private Long updatingUserID;

    @Column(name = "updating_date")
    private LocalDateTime updatingDate;
}
