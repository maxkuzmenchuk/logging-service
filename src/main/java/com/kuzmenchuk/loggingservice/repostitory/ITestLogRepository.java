package com.kuzmenchuk.loggingservice.repostitory;

import com.kuzmenchuk.loggingservice.repostitory.model.TestLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITestLogRepository extends JpaRepository<TestLogEntity, Long> {
}
