package com.collage.student.managment.controller.exception;

@SuppressWarnings("NonFinalFieldOfException")
public class NationalProviderException extends RuntimeException {

    private static final long serialVersionUID = 98798237498231L;

    private String errorCode;
    private String errorMessage;

    public NationalProviderException() {
        super();
    }

    public NationalProviderException(final String errorCode, final String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public NationalProviderException(final String errorCode, final String errorMessage, final Throwable throwable) {
        super(errorMessage, throwable);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}
