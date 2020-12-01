package lecturesharingproject.lecturesharing.dao;

import lecturesharingproject.lecturesharing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {

    @Query(value = "select u from User u where u.university=:university")
    User findUserByUniversity(String university);

    @Query(value = "select u from User u where u.login=:login")
    List<User> findUserByLogin(String login);

}
