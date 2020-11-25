package lecturesharingproject.lecturesharing.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Lecture {
    private int id;
    private LessonName lessonName;
    private String title;
    private String lessonDescription;


