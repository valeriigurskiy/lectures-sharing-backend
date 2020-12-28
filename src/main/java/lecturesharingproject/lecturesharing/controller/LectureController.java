package lecturesharingproject.lecturesharing.controller;

import lecturesharingproject.lecturesharing.entity.Comment;
import lecturesharingproject.lecturesharing.entity.Lecture;
import lecturesharingproject.lecturesharing.service.CommentService;
import lecturesharingproject.lecturesharing.service.LectureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping("/lectures")
@Slf4j
public class LectureController {

    @Autowired
    private LectureService lectureService;
    private CommentService commentService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<Lecture> getLectures() {
        return lectureService.getAllLectures();
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/{id}")
    public Lecture findLectureById(@PathVariable int id){
        return lectureService.getLecture(id);
    }

    //TODO method getLectureByUniversity
    //    @GetMapping(value="/{university}")
    //    public List<Lecture> getLectureByUniversity(@PathVariable String university){
    //        return lectureService.get
    //    }
    @CrossOrigin(origins = "*")
    @PostMapping
    public Lecture insertLecture(@RequestBody Lecture lecture) {
        Lecture newLecture = new Lecture(lecture.getId(), lecture.getName(), lecture.getDescription(), lecture.getTitle(), lecture.getUniversity());
        return lectureService.insertLecture(newLecture);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteLecture(@PathVariable int id) {
        lectureService.removeLecture(id);
    }
}
