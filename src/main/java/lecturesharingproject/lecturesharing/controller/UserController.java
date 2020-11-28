package lecturesharingproject.lecturesharing.controller;

import lecturesharingproject.lecturesharing.entity.User;
import lecturesharingproject.lecturesharing.service.UserService;
import lecturesharingproject.lecturesharing.validator.UserValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;
    private UserValidator userValidator;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

//    @CrossOrigin(origins = "http://localhost:4200")
//    @GetMapping(value = "/{id}")
//    public User getUsersById(@PathVariable int id) {
//        return userService.getUser(id);
//    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/{university}")
    public User getUserByUniversity(@PathVariable String university) {
        return userService.getUniversity(university);
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public User insertUser(@RequestBody User user) {
        User newUser = new User(user.getId(), user.getLogin(), user.getPassword(), user.getName(), user.getLastname(), user.getAge(), user.getUniversity(), user.getRole());
        return userService.insertUser(newUser);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.removeUser(id);
    }

//    TODO Validator
//    @InitBinder
//    public void initBinder(WebDataBinder webDataBinder) {
//        webDataBinder.addValidators(this.userValidator);
//        webDataBinder.validate();
//    }
}
