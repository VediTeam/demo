package com.sgic.demo.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
public class ResponseWrapper<T> {
    public ResponseWrapper(int statusCode, String statusMessage, T data) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
        this.data = data;
    }

    private int statusCode;
    private String statusMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;
    public ResponseWrapper(int statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }
}
