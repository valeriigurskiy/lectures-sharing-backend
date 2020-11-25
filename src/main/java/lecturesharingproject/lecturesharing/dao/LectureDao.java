package lecturesharingproject.lecturesharing.dao;

import lecturesharingproject.lecturesharing.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LectureDao extends JpaRepository<Lecture, Integer> {


    @Query("SELECT id, lessonName, title, lessonDescription FROM Lecture")
    List<Lecture> findAll();

    @Query("SELECT l FROM Lecture as l WHERE l.title=:title")
    Lecture findLectureByTitle(String title);

}
