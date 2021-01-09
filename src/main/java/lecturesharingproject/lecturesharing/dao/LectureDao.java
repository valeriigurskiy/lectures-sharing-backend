package lecturesharingproject.lecturesharing.dao;

import lecturesharingproject.lecturesharing.entity.Lecture;
import lecturesharingproject.lecturesharing.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LectureDao extends JpaRepository<Lecture, Integer> {

    @Query(value = "select l from Lecture l where l.teacher=:teacher")
    List<Lecture> findTeacherLectures(String teacher);

}
