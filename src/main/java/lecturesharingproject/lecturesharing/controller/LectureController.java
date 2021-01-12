package lecturesharingproject.lecturesharing.controller;

import lecturesharingproject.lecturesharing.entity.Lecture;
import lecturesharingproject.lecturesharing.service.LectureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lectures")
@Slf4j
public class LectureController {

    @Autowired
    private LectureService lectureService;


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
        Lecture newLecture = new Lecture(lecture.getId(), lecture.getName(), lecture.getTitle(), lecture.getDescription(), lecture.getUniversity(), lecture.getTeacher(), lecture.getUser(), 0, false);
        return lectureService.insertLecture(newLecture);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/teacher/{teacher}")
    public List<Lecture> getTeacherLecture(@PathVariable String teacher){
        return lectureService.getTeacherLectures(teacher);
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/{id}/rate/{rate}")
    public Lecture updateRate(@PathVariable int id, @PathVariable int rate){
        Lecture lecture = lectureService.getLecture(id);
        Lecture newLecture = new Lecture(lecture.getId(),lecture.getName(), lecture.getTitle(), lecture.getDescription(), lecture.getUniversity(), lecture.getTeacher(), lecture.getUser(), rate, true);
        lectureService.insertLecture(newLecture);
        return newLecture;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/teacher/{teacher}/checked")
    public List<Lecture> teacherCheckedLectures(@PathVariable String teacher){
        return lectureService.findTeacherCheckedLecture(teacher);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/teacher/{teacher}/unchecked")
    public List<Lecture> teacherUncheckedLectures(@PathVariable String teacher){
        return lectureService.findTeacherUncheckedLecture(teacher);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteLecture(@PathVariable int id) {
        lectureService.removeLecture(id);
    }
}
