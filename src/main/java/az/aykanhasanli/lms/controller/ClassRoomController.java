package az.aykanhasanli.lms.controller;

import az.aykanhasanli.lms.dto.request.ClassRoomRequest;
import az.aykanhasanli.lms.dto.request.LecturerRequest;
import az.aykanhasanli.lms.enity.ClassRoom;
import az.aykanhasanli.lms.enity.Lecturer;
import az.aykanhasanli.lms.enity.Student;
import az.aykanhasanli.lms.service.ClassRoomService;
import az.aykanhasanli.lms.service.LecturerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/classroom")
@RestController
@RequiredArgsConstructor
public class ClassRoomController {
    private final ClassRoomService classRoomService;

    @PostMapping
    public ResponseEntity<ClassRoom> create(@RequestBody ClassRoomRequest classRoomRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(classRoomService.create(classRoomRequest));
    }

    @GetMapping( "/{id}")
    public ResponseEntity<ClassRoom> getById(@PathVariable("id") Long id ) {

        return ResponseEntity.status(HttpStatus.OK).body(classRoomService.getById(id));
    }

}
