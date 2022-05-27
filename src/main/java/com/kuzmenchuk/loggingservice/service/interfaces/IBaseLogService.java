package com.kuzmenchuk.loggingservice.service.interfaces;

import java.util.Optional;

public interface IBaseLogService<T> {
    void addToLog(T entityDTO);

    void deleteFromLog();

    Optional<T> getLogByID(Long logID);


}
