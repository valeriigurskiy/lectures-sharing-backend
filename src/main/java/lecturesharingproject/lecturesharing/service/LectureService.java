package lecturesharingproject.lecturesharing.service;

import lecturesharingproject.lecturesharing.dao.LectureDao;
import lecturesharingproject.lecturesharing.entity.Lecture;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class LectureService implements ILectureService {

    @Autowired
    private LectureDao lectureDao;

    @Override
    public Lecture insertLecture(Lecture lecture) {
        return lectureDao.save(lecture);
    }

    @Override
    public List<Lecture> getAllLectures() {
        return lectureDao.findAll();
    }

    @Override
    public Lecture getLecture(int id) {
        return lectureDao.findById(id).orElseThrow(() -> new RuntimeException("Error"));
    }

    //TODO Add method findLectureByUniversity
//    public List<Lecture> getLectureByUniversity(String university){
//        return lectureDao.findAll().
//    }

    @Override
    public void removeLecture(int id) {
        lectureDao.deleteById(id);
    }
}
