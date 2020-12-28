package lecturesharingproject.lecturesharing.service;
import lecturesharingproject.lecturesharing.entity.Lecture;
import lecturesharingproject.lecturesharing.entity.Teacher;
import lecturesharingproject.lecturesharing.entity.University;
import lecturesharingproject.lecturesharing.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IUniversityService {

    University insertUniversity(University university);

    List<University> getAllUniversity();

    Optional<University> getUniversity(int id);

    void removeUniversity(int id);

    List<User> findUniversityUsers(String name);

    University findUniversityByName(String name);

    List<Teacher> findUniversityTeachers(String name);

    List<Lecture> findUniversityLectures(String university);

}
