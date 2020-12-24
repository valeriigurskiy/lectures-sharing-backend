package lecturesharingproject.lecturesharing.dao;

import lecturesharingproject.lecturesharing.entity.Teacher;
import lecturesharingproject.lecturesharing.entity.University;
import lecturesharingproject.lecturesharing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UniversityDao extends JpaRepository<University, Integer> {

    @Query(value = "select u from User u where u.name=:name")
    List<User> findUniversityUsers(String name);

    @Query(value = "select t from Teacher t where t.university=:name")
    List<Teacher> findUniversityTeachers(String name);

    @Query(value = "select u from University u where u.name=:name")
    University findUniversityByName(String name);

}
