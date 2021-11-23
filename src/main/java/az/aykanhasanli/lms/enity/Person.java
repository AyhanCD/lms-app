package az.aykanhasanli.lms.enity;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class Person {
    private String name;
    private String surname;
    private String patronymic;
    private String fullName;
    private String address;
    private String email;
    private String phone;
}
