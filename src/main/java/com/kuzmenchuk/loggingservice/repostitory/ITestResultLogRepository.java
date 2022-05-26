package com.kuzmenchuk.loggingservice.repostitory;

import com.kuzmenchuk.loggingservice.repostitory.model.TestResultLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITestResultLogRepository extends JpaRepository<TestResultLogEntity, Long> {
}
