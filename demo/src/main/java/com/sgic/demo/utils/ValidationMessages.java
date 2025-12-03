package com.sgic.demo.utils;

public class ValidationMessages {

    private ValidationMessages() {
        // Private constructor to prevent instantiation
    }

    // General validation messages
    public static final String VALIDATION_FAILED = "Validation failed. Please check your input values.";
    public static final String MISMATCH_INPUT = "Input type mismatch. Please verify your request parameters.";
    public static final String WRONG_JSON = "Malformed JSON request. Please check your request body format.";
    public static final String WRONG_API_CALL = "HTTP method not allowed for this endpoint.";
    public static final String MIN_REQUIREMENT = "Request does not meet the minimum required constraints.";

    // Database-related messages
    public static final String DUPLICATE_ENTRY = "Duplicate entry found. The record already exists.";
    public static final String FOREIGN_KEY_CONSTRIN = "Operation failed due to foreign key constraint violation.";
    public static final String INVALID_ID = "No record found for the provided ID.";

    // Authentication and authorization
    public static final String INVALID_CREDENTIAL = "Invalid credentials. Please check your username or password.";

    // Generic errors
    public static final String INTERNAL_ERROR = "An unexpected error occurred. Please try again later.";
}
