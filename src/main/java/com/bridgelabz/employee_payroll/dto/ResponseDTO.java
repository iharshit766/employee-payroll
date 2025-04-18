package com.bridgelabz.employee_payroll.dto;

public class ResponseDTO {
    private String message;
    private Object data;

    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    // Getters and setters
}
