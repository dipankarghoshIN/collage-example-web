package com.collage.student.managment.controller.exception;

import com.collage.student.managment.utilites.I18NMessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.NoSuchMessageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExceptionHandler {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private I18NMessageHandler messageHandler;

    private GlobalExceptionHandler() {
        super();
    }

    @Autowired
    public GlobalExceptionHandler(final I18NMessageHandler messageHandler) {
        super();
        this.messageHandler = messageHandler;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public final ResponseEntity<ExceptionResponse> invalidInput(final MethodArgumentNotValidException exception) {
        BindingResult result = exception.getBindingResult();
        ExceptionResponse response = new ExceptionResponse();
        response.setErrorCode("Validation Error");
        response.setErrorMessage("Invalid inputs");
        response.setErrors(this.getFieldErrors(result));
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ResponseStatus
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> handleBadRequest(final HttpServletRequest request, final Exception exception) {
        log.error("Exception caught ", exception);
        ExceptionResponse response = new ExceptionResponse();
        response.setErrorCode("Internal Server Error");
        response.setErrorMessage("An unanticipated error occured.");
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ResponseStatus
    @ExceptionHandler(NationalProviderException.class)
    public ResponseEntity<ExceptionResponse> handleInternalError(final HttpServletRequest request, final NationalProviderException exception) {
        log.error("An error occured ", exception);
        ExceptionResponse response = new ExceptionResponse();
        response.setErrorCode(exception.getErrorCode());
        response.setErrorMessage(exception.getErrorMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionResponse> resourceNotFound(ResourceNotFoundException ex) {
        ExceptionResponse response = new ExceptionResponse();
        response.setErrorCode("Not Found");
        response.setErrorMessage(ex.getMessage());
        return new ResponseEntity<ExceptionResponse>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ExceptionResponse> badRequest(ValidationException ex) {
        ExceptionResponse response = new ExceptionResponse();
        response.setErrorCode("Bad Request");
        response.setErrorMessage(ex.getMessage());
        return new ResponseEntity<ExceptionResponse>(response, HttpStatus.BAD_REQUEST);
    }

    private List<String> getFieldErrors(final BindingResult result) {
        List<FieldError> fieldErrors = result.getFieldErrors();
        return fieldErrors.stream()
                .map(fieldError -> (fieldError.getField() + " : " +
                        this.getMessage(fieldError)))
                .collect(Collectors.toList());
    }

    private String getMessage(final FieldError fieldError) {
        String defaultMessage = fieldError.getDefaultMessage();
        String message;
        try {
            message = this.messageHandler.getMessage(defaultMessage);
        } catch (final NoSuchMessageException messageException) {
            log.warn(messageException.getMessage());
            return defaultMessage;
        }
        return message;
    }
}
