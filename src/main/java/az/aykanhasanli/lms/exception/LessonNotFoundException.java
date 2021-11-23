package az.aykanhasanli.lms.exception;

public class LessonNotFoundException extends RuntimeException {
    public LessonNotFoundException(Long lessonId) {
        super(String.format("Lesson not found by id %s", lessonId));
    }
}
