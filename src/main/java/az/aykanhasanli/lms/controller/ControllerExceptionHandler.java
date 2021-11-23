package az.aykanhasanli.lms.controller;


import az.aykanhasanli.lms.dto.request.StudentRequest;
import az.aykanhasanli.lms.enity.Student;
import az.aykanhasanli.lms.exception.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<String> studentNotFound(StudentNotFoundException studentNotFoundException) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(studentNotFoundException.getMessage());
    }
}
