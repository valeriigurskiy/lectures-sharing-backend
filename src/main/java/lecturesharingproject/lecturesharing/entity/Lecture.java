package lecturesharingproject.lecturesharing.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 16)
    private String name;
    @Column(nullable = false, length = 32)
    private String title;
    @Column(nullable = false, length = 64)
    private String description;
    @Column(nullable = false, length = 32)
    private String university;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "lecture_id")
    private List<Comment> comments;

    public Lecture(int id, String name, String description, String title, String university) {
    }
}


