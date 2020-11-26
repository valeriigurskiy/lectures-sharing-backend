package lecturesharingproject.lecturesharing.service;

import lecturesharingproject.lecturesharing.dao.UserDao;
import lecturesharingproject.lecturesharing.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class UserService implements IUserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User insertUser(User user) {
        return userDao.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User getUser(int id) {
        return userDao.getOne(id);
    }

    @Override
    public void removeUser(int id) {
        userDao.deleteById(id);
    }

    @Override
    public User getUniversity(String university) {
        return userDao.findUserByUniversity(university);
    }
}
