package lecturesharingproject.lecturesharing.controller;

import lecturesharingproject.lecturesharing.entity.Teacher;
import lecturesharingproject.lecturesharing.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@Slf4j
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<Teacher> getTeachers() {
        return teacherService.getAllTeachers();
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/teacher/{login}")
    public Teacher getUserByLogin(@PathVariable String login){
        return teacherService.findTeacherByLogin(login);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable int id) {
        teacherService.removeTeacher(id);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/university/{university}")
    public List<Teacher> getUniversity(@PathVariable String university){
        return teacherService.getUniversity(university);
    }

}
