package az.aykanhasanli.lms.repository;

import az.aykanhasanli.lms.enity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomRepository extends JpaRepository<ClassRoom,Long> {
}
