package com.deahtstroke.loginsample.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponseDto {

    /**
     * Error message code
     */
    private String code;

    /**
     * Error message details
     */
    private String details;

    /**
     * Error message
     */
    private String message;
}
