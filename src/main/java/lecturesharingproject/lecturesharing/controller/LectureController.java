package lecturesharingproject.lecturesharing.controller;

import lecturesharingproject.lecturesharing.entity.Lecture;
import lecturesharingproject.lecturesharing.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class LectureController {

    @Autowired
    private LectureService lectureService;

    @GetMapping
    public List<Lecture> getLectures() {
        return lectureService.getAllLectures();
    }

    @GetMapping(value = "/{id}")
    public Lecture findLectureById(@PathVariable int id){
        return lectureService.getLecture(id);
    }

    @PostMapping
    public Lecture insertLecture(@RequestBody Lecture lecture) {
        Lecture newLecture = new Lecture(lecture.getId(), lecture.getLessonName(), lecture.getLessonDescription(), lecture.getTitle());
        return lectureService.insertLecture(newLecture);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteLecture(@PathVariable int id) {
        lectureService.removeLecture(id);
    }
}
