package lecturesharingproject.lecturesharing.service;

import lecturesharingproject.lecturesharing.entity.Lecture;

import java.util.List;

public interface ILectureService {

    Lecture insertLecture(Lecture lecture);

    List<Lecture> getAllLectures();

    Lecture getLecture(int id);

    void removeLecture(int id);

}
