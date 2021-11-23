package az.aykanhasanli.lms.service;


import az.aykanhasanli.lms.repository.RegistrationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RegistrationService {
    private final RegistrationRepository registrationRepository;
}
