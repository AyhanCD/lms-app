package az.aykanhasanli.lms.enity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "classes")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "class_room_id")
    private List<Registration> registrations=new ArrayList<>();


    @ManyToOne
    private Lesson lesson;

    @ManyToOne
    private Lecturer lecturer;

    @OneToMany
    @JoinColumn(name = "class_room_id")
    private List<Schedule> schedules=new ArrayList<>();


    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
