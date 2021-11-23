package az.aykanhasanli.lms.mapper;

import az.aykanhasanli.lms.dto.request.StudentRequest;
import az.aykanhasanli.lms.enity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class StudentMapper {

    public static final StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    public abstract Student requestToEntity( StudentRequest studentRequest);

}
