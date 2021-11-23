package az.aykanhasanli.lms.controller;

import az.aykanhasanli.lms.dto.request.LessonRequest;
import az.aykanhasanli.lms.dto.request.StudentRequest;
import az.aykanhasanli.lms.enity.Lesson;
import az.aykanhasanli.lms.enity.Student;
import az.aykanhasanli.lms.service.LessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson")
@RestController
@RequiredArgsConstructor
public class LessonController {
    private final LessonService lessonService;

    @PostMapping
    public ResponseEntity<Lesson> create(@RequestBody LessonRequest lessonRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(lessonService.create(lessonRequest));
    }

}
