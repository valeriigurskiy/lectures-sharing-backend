package lecturesharingproject.lecturesharing.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Lecture {
    @Id
    private int id;
    private LessonName lessonName;
    private String title;
    private String lessonDescription;
}



