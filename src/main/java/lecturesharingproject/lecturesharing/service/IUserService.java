package lecturesharingproject.lecturesharing.service;

import lecturesharingproject.lecturesharing.entity.Lecture;
import lecturesharingproject.lecturesharing.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {

    User insertUser(User user);

    List<User> getAllUsers();

    User getUser(int id);

    void removeUser(int id);

}
