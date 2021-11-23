package az.aykanhasanli.lms.service;


import az.aykanhasanli.lms.dto.request.LessonRequest;
import az.aykanhasanli.lms.dto.request.StudentRequest;
import az.aykanhasanli.lms.enity.Lesson;
import az.aykanhasanli.lms.enity.Student;
import az.aykanhasanli.lms.mapper.StudentMapper;
import az.aykanhasanli.lms.repository.LessonRepository;
import az.aykanhasanli.lms.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class LessonService {
    private final LessonRepository lessonRepository;

    public Lesson create(LessonRequest lessonRequest) {
        log.info("start...  lessonRequest  {}", lessonRequest);

        Lesson lesson = new Lesson();
        lesson.setLessonName(lessonRequest.getName());
        lesson = lessonRepository.save(lesson);
        log.info("end... lesson  {}", lesson);
        return lesson;
    }
}
