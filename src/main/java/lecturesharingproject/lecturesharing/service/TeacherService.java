package lecturesharingproject.lecturesharing.service;

import lecturesharingproject.lecturesharing.dao.TeacherDao;
import lecturesharingproject.lecturesharing.entity.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TeacherService implements ITeacherService{

    @Autowired
    private TeacherDao teacherDao;


    @Override
    public Teacher insertTeacher(Teacher teacher) {
        return teacherDao.save(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherDao.findAll();
    }

    @Override
    public Teacher getTeacher(int id) {
        return teacherDao.getOne(id);
    }

    @Override
    public void removeTeacher(int id) {
        teacherDao.deleteById(id);
    }

    @Override
    public List<Teacher> getUniversity(String university) {
        return teacherDao.findTeacherByUniversity(university);
    }

    @Override
    public Teacher findTeacherByLogin(String login) {
        return teacherDao.findTeacherByLogin(login);
    }
}
