package lecturesharingproject.lecturesharing.controller;

import lecturesharingproject.lecturesharing.entity.Lecture;
import lecturesharingproject.lecturesharing.entity.Teacher;
import lecturesharingproject.lecturesharing.entity.University;
import lecturesharingproject.lecturesharing.entity.User;
import lecturesharingproject.lecturesharing.service.UniversityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/university")
@Slf4j
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<University> getUniversity() {
        return universityService.getAllUniversity();
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/{id}")
    public Optional<University> findUniversityById(@PathVariable int id) {
        return universityService.getUniversity(id);
    }

//    @PostMapping
//    public University insertUniversity(@RequestBody University university) {
//        University newUniversity = new University(university.getId(), university.getName(), university.getAddress(), university.getPictureURL(), '');
//        return universityService.insertUniversity(newUniversity);
//    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/{name}/users")
    public List<User> findUniversityUsers(@PathVariable String name){
        return universityService.findUniversityUsers(name);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/name/{name}")
    public University findUniversityByName(@PathVariable String name){
        return universityService.findUniversityByName(name);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/{name}/teachers")
    public List<Teacher> findUniversityTeachers(@PathVariable String name){
        return universityService.findUniversityTeachers(name);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/{name}/lectures")
    public List<Lecture> findUniversityLectures(@PathVariable String name){
        return universityService.findUniversityLectures(name);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUniversity(@PathVariable int id) {
        universityService.removeUniversity(id);
    }
}
