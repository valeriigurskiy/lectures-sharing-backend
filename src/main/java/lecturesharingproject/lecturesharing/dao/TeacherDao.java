package lecturesharingproject.lecturesharing.dao;

import lecturesharingproject.lecturesharing.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherDao extends JpaRepository<Teacher, Integer> {
}
