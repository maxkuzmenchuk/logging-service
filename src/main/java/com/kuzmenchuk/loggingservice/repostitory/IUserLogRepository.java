package com.kuzmenchuk.loggingservice.repostitory;

import com.kuzmenchuk.loggingservice.repostitory.model.UserLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserLogRepository extends JpaRepository<UserLogEntity, Long> {

}
