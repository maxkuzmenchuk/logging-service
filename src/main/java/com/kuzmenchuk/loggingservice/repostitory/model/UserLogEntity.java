package com.kuzmenchuk.loggingservice.repostitory.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "user_log")
public class UserLogEntity extends LogBaseEntity {
    @Column(name = "user_id")
    private Long userID;

    @Column(name = "updated_field")
    private String updatedField;

    @Column(name = "old_value")
    private String oldValue;

    @Column(name = "new_value")
    private String newValue;
}
