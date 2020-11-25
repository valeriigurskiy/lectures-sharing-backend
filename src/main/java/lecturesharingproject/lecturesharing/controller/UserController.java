package lecturesharingproject.lecturesharing.controller;

import lecturesharingproject.lecturesharing.entity.Lecture;
import lecturesharingproject.lecturesharing.entity.User;
import lecturesharingproject.lecturesharing.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/{id}")
    public User getUsersById(@PathVariable int id) {
        return userService.getUser(id);
    }

    @PostMapping
    public User insertUser(@RequestBody User user){
        User newUser = new User(user.getId(), user.getLogin(),user.getName(),user.getLastname(), user.getAge());
        return userService.insertUser(newUser);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.removeUser(id);
    }

}
