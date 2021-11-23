package az.aykanhasanli.lms.repository;

import az.aykanhasanli.lms.enity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Long> {
}
