package lecturesharingproject.lecturesharing.dao;

import lecturesharingproject.lecturesharing.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureDao extends JpaRepository<Lecture, Integer> {

}
