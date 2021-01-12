package lecturesharingproject.lecturesharing.dao;

import lecturesharingproject.lecturesharing.entity.Teacher;
import lecturesharingproject.lecturesharing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeacherDao extends JpaRepository<Teacher, Integer> {

    @Query(value = "select t from Teacher t where t.university=:university")
    List<Teacher> findTeacherByUniversity(String university);

    @Query(value = "select t from Teacher t where t.login=:login")
    Teacher findTeacherByLogin(String login);
}
