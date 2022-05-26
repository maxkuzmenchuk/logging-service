package com.kuzmenchuk.loggingservice.repostitory;

import com.kuzmenchuk.loggingservice.repostitory.model.FileLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFileLogRepository extends JpaRepository<FileLogEntity, Long> {
}
