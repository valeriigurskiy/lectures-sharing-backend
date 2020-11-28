package lecturesharingproject.lecturesharing.controller;

import lecturesharingproject.lecturesharing.entity.University;
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

    @PostMapping
    public University insertUniversity(@RequestBody University university) {
        University newUniversity = new University(university.getId(), university.getName(), university.getAddress(), university.getPictureURL());
        return universityService.insertUniversity(newUniversity);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUniversity(@PathVariable int id) {
        universityService.removeUniversity(id);
    }
}
