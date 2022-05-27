package com.kuzmenchuk.loggingservice.controller;

import com.kuzmenchuk.loggingservice.repostitory.model.dto.UserLogDTO;
import com.kuzmenchuk.loggingservice.service.interfaces.IUserLogService;
import com.kuzmenchuk.loggingservice.util.CustomResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserLogController {
    private final IUserLogService userLogService;

    private Map<String, Object> successResponseBody = new HashMap<>();

    private Map<String, Object> errorResponseBody = new HashMap<>();

    @PostMapping("/save-log")
    public ResponseEntity<Map<String, Object>> saveLog(@RequestBody UserLogDTO userLogDTO) {
        try {

            UserLogDTO newLog = userLogService.addToLog(userLogDTO);
            successResponseBody.clear();
            successResponseBody = CustomResponse.createSuccessResponse("Log saved successfully", newLog);

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(successResponseBody);
        } catch (Exception exception) {
            errorResponseBody.clear();
            errorResponseBody = CustomResponse.createErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), exception.getMessage());

            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(errorResponseBody);
        }
    }

    @GetMapping("/get-all")
    public ResponseEntity<Map<String, Object>> getLogs() {
        try {
            successResponseBody.clear();
            successResponseBody = CustomResponse.createSuccessResponse("Success", userLogService.getAllLogs());

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(successResponseBody);
        } catch (Exception exception) {
            errorResponseBody.clear();
            errorResponseBody = CustomResponse.createErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), exception.getMessage());

            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(errorResponseBody);
        }
    }
}
