package az.aykanhasanli.lms.mapper;

import az.aykanhasanli.lms.dto.request.LecturerRequest;
import az.aykanhasanli.lms.dto.request.StudentRequest;
import az.aykanhasanli.lms.enity.Lecturer;
import az.aykanhasanli.lms.enity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class LecturerMapper {

    public static final LecturerMapper INSTANCE = Mappers.getMapper(LecturerMapper.class);

    public abstract Lecturer requestToEntity(LecturerRequest lecturerRequest);

}
