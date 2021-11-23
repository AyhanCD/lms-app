package az.aykanhasanli.lms.service;


import az.aykanhasanli.lms.dto.request.StudentRequest;
import az.aykanhasanli.lms.enity.Student;
import az.aykanhasanli.lms.exception.StudentNotFoundException;
import az.aykanhasanli.lms.mapper.StudentMapper;
import az.aykanhasanli.lms.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentService {
    private final StudentRepository studentRepository;

    public Student create(StudentRequest studentRequest) {
        log.info("start...  studentRequest  {}", studentRequest);
        Student student = StudentMapper.INSTANCE.requestToEntity(studentRequest);
        student = studentRepository.save(student);
        log.info("end... student  {}", student);
        return student;
    }

    public Student update(StudentRequest studentRequest) {

        Student student = getById(studentRequest.getId());
        log.info("start...  studentRequest  {}", studentRequest);
        student = StudentMapper.INSTANCE.requestToEntity(studentRequest);
        student = studentRepository.save(student);
        log.info("end... student  {}", student);
        return student;
    }


    public Student getById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
    }

    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }
}
