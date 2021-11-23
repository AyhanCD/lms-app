package az.aykanhasanli.lms.service;


import az.aykanhasanli.lms.dto.request.ClassRoomRequest;
import az.aykanhasanli.lms.dto.request.LecturerRequest;
import az.aykanhasanli.lms.enity.ClassRoom;
import az.aykanhasanli.lms.enity.Lecturer;
import az.aykanhasanli.lms.enity.Lesson;
import az.aykanhasanli.lms.exception.LecturerNotFoundException;
import az.aykanhasanli.lms.exception.LessonNotFoundException;
import az.aykanhasanli.lms.mapper.LecturerMapper;
import az.aykanhasanli.lms.repository.ClassRoomRepository;
import az.aykanhasanli.lms.repository.LecturerRepository;
import az.aykanhasanli.lms.repository.LessonRepository;
import az.aykanhasanli.lms.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClassRoomService {
    private final ClassRoomRepository classRoomRepository;
    private final LecturerRepository  lecturerRepository;
    private final LessonRepository lessonRepository;


    @Transactional
    public ClassRoom create(ClassRoomRequest classRoomRequest) {
        log.info("start...  classRoomRequest  {}", classRoomRequest);
        Lesson lesson=lessonRepository.findById(classRoomRequest.getLessonId())
                .orElseThrow(()->new LessonNotFoundException(classRoomRequest.getLessonId()));
        Lecturer lecturer=lecturerRepository.findById(classRoomRequest.getLecturerId())
                .orElseThrow(()->new LecturerNotFoundException(classRoomRequest.getLecturerId()));
        ClassRoom classRoom = new ClassRoom();
        classRoom.setLecturer(lecturer);
        classRoom.setLesson(lesson);

        classRoom = classRoomRepository.save(classRoom);
        log.info("end... classRoom  {}", classRoom);
        return classRoom;
    }

    public ClassRoom getById(Long id){
        return  classRoomRepository.findById(id)
                .orElseThrow(()->new LessonNotFoundException(id));
    }


}
