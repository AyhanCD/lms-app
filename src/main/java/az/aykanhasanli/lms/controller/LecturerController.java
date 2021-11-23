package az.aykanhasanli.lms.controller;

import az.aykanhasanli.lms.dto.request.LecturerRequest;
import az.aykanhasanli.lms.dto.request.LessonRequest;
import az.aykanhasanli.lms.enity.Lecturer;
import az.aykanhasanli.lms.enity.Lesson;
import az.aykanhasanli.lms.repository.LecturerRepository;
import az.aykanhasanli.lms.service.LecturerService;
import az.aykanhasanli.lms.service.LessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lecturer")
@RestController
@RequiredArgsConstructor
public class LecturerController {
    private final LecturerService lecturerService;

    @PostMapping
    public ResponseEntity<Lecturer> create(@RequestBody LecturerRequest lecturerRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(lecturerService.create(lecturerRequest));
    }

}
