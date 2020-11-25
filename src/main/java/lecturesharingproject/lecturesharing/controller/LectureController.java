package lecturesharingproject.lecturesharing.controller;

import lecturesharingproject.lecturesharing.entity.Lecture;
import lecturesharingproject.lecturesharing.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class LectureController {

    private LectureService lectureService;
    @Autowired
    public LectureController(LectureService lectureService){
        this.lectureService = lectureService;
    }

    @GetMapping(value = "/lectures")
    public List<Lecture> getLectures(){
        return this.lectureService.getLectures();
    }
}
