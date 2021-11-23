package az.aykanhasanli.lms.dto.request;

import lombok.Data;

@Data
public class LecturerRequest {
    private Long id;
    private String name;
    private String surname;
    private String patronymic;
    private String fullName;
    private String address;
    private String email;
    private String phone;
}
