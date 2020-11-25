package lecturesharingproject.lecturesharing.service;

import lecturesharingproject.lecturesharing.dao.LectureDao;
import lecturesharingproject.lecturesharing.entity.Lecture;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LectureService {

    @Autowired
    private LectureDao lecturedao;

    public List<Lecture> getLectures(){
        return lecturedao.findAll();
    }
}
