package az.aykanhasanli.lms.repository;

import az.aykanhasanli.lms.enity.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LecturerRepository extends JpaRepository<Lecturer,Long> {
}
