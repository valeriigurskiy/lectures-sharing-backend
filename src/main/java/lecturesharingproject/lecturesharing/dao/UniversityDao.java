package lecturesharingproject.lecturesharing.dao;

import lecturesharingproject.lecturesharing.entity.Teacher;
import lecturesharingproject.lecturesharing.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityDao extends JpaRepository<University, Integer> {



}
