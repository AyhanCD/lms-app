package az.aykanhasanli.lms.repository;

import az.aykanhasanli.lms.enity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface LessonRepository extends JpaRepository<Lesson,Long> {
}
