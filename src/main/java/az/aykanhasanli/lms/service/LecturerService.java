package az.aykanhasanli.lms.service;


import az.aykanhasanli.lms.dto.request.LecturerRequest;
import az.aykanhasanli.lms.dto.request.LessonRequest;
import az.aykanhasanli.lms.enity.Lecturer;
import az.aykanhasanli.lms.enity.Lesson;
import az.aykanhasanli.lms.mapper.LecturerMapper;
import az.aykanhasanli.lms.repository.LecturerRepository;
import az.aykanhasanli.lms.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class LecturerService {
    private final LecturerRepository lecturerRepository;

    public Lecturer create(LecturerRequest lecturerRequest) {
        log.info("start...  lecturerRequest  {}", lecturerRequest);
        Lecturer lecturer = LecturerMapper.INSTANCE.requestToEntity(lecturerRequest);
        lecturer = lecturerRepository.save(lecturer);
        log.info("end... lecturer  {}", lecturer);
        return lecturer;
    }
}
