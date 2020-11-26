package lecturesharingproject.lecturesharing.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 16)
    private LessonName lessonName;
    //    private String lessonName;
    @Column(nullable = false, length = 32)
    private String title;
    @Column(nullable = false, length = 64)
    private String lessonDescription;
}


