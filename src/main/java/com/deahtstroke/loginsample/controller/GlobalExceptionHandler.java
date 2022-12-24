package com.deahtstroke.loginsample.controller;

import com.deahtstroke.loginsample.dto.ErrorResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final String ILLEGAL_ARGUMENT_ERROR = "error.illegal.argument";

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponseDto> handleIllegalArgumentException(
            IllegalArgumentException illegalArgumentException){
        var errorResponse = ErrorResponseDto.builder()
                .code(ILLEGAL_ARGUMENT_ERROR)
                .details("Something wrong happened with JPA")
                .message(illegalArgumentException.getMessage())
                .build();
        return ResponseEntity.badRequest().body(errorResponse);
    }
}
