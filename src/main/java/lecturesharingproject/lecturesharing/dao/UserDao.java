package lecturesharingproject.lecturesharing.dao;

import lecturesharingproject.lecturesharing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

}
