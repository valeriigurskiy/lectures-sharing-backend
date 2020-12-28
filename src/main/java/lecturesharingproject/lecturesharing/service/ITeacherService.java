package lecturesharingproject.lecturesharing.service;

import lecturesharingproject.lecturesharing.entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITeacherService {

    Teacher insertTeacher(Teacher teacher);

    List<Teacher> getAllTeachers();

    Teacher getTeacher(int id);

    void removeTeacher(int id);

    List<Teacher> getUniversity(String university);

    Teacher findTeacherByLogin(String login);

}
