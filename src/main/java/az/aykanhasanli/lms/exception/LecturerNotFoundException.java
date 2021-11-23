package az.aykanhasanli.lms.exception;

public class LecturerNotFoundException extends RuntimeException {
    public LecturerNotFoundException(Long id) {
        super(String.format("Lecturer not found by id %s", id));
    }
}
