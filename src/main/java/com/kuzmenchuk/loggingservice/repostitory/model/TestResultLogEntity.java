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
@Table(name = "test_results_log")
public class TestResultLogEntity extends LogBaseEntity {
    @Column(name = "test_id")
    private Long testID;
}
