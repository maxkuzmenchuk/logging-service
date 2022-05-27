package com.kuzmenchuk.loggingservice.service.interfaces;

import java.util.List;

public interface IBaseLogService<T> {
    T addToLog(T entityDTO);

    void deleteFromLog();

    T getLogByID(Long logID);

    List<T> getAllLogs();


}
