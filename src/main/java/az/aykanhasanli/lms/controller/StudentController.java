package az.aykanhasanli.lms.controller;


import az.aykanhasanli.lms.dto.request.StudentRequest;
import az.aykanhasanli.lms.enity.Student;
import az.aykanhasanli.lms.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/student")
@RestController
@RequiredArgsConstructor

public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody StudentRequest studentRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.create(studentRequest));
    }

    @PutMapping
    public ResponseEntity<Student> update(@RequestBody StudentRequest studentRequest) {

        return ResponseEntity.status(HttpStatus.OK).body(studentService.update(studentRequest));
    }

    @GetMapping( "/{id}")
    public ResponseEntity<Student> getById(@PathVariable("id") Long id ) {

        return ResponseEntity.status(HttpStatus.OK).body(studentService.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudentLIst( ) {

        return ResponseEntity.status(HttpStatus.OK).body(studentService.getStudentList());
    }
}
