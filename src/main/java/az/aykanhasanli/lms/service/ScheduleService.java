package az.aykanhasanli.lms.service;


import az.aykanhasanli.lms.repository.ScheduleRepository;
import az.aykanhasanli.lms.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;
}
