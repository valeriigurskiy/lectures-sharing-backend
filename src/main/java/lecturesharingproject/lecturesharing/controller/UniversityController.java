package lecturesharingproject.lecturesharing.controller;

import lecturesharingproject.lecturesharing.entity.Lecture;
import lecturesharingproject.lecturesharing.entity.University;
import lecturesharingproject.lecturesharing.service.LectureService;
import lecturesharingproject.lecturesharing.service.UniversityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(value = "/{id}")
    public University findUniversityById(@PathVariable int id) {
        return universityService.getUniversity(id);
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public University insertUniversity(@RequestBody University university) {
        University newUniversity = new University(university.getId(), university.getName(), university.getAddress());
        return universityService.insertUniversity(newUniversity);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUniversity(@PathVariable int id) {
        universityService.removeUniversity(id);
    }
}
