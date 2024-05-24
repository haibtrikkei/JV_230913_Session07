package com.rikkeiacademy.demo_api_standard.advice;

import com.rikkeiacademy.demo_api_standard.dto.response.DataException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class APICustomValidateAdvice {
    @ExceptionHandler(NoSuchElementException.class)
    public DataException<String> handleNoSuch(NoSuchElementException ex){
        return new DataException<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public DataException<Map<String,String>> handleError2(MethodArgumentNotValidException ex){
        Map<String, String> map = new HashMap<>();
        for(FieldError error : ex.getFieldErrors()){
            map.put(error.getField(),error.getDefaultMessage());
        }
        return new DataException<>(map,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public DataException<String> handleError3(DataIntegrityViolationException ex){
        return new DataException<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
    }
}
