package az.aykanhasanli.lms.exception;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(Long id){
        super(String.format("Student not found by id %s",id));
    }

}
