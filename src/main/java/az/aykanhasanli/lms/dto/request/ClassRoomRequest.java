package az.aykanhasanli.lms.dto.request;

import lombok.Data;

@Data
public class ClassRoomRequest {
    private Long id;
    private Long lecturerId;
    private Long lessonId;
}
