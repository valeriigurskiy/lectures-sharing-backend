package lecturesharingproject.lecturesharing.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 128)
    private String content;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private Lecture lecture;

    public Comment(int id, String content, int id1) {
    }

    public Comment(int id, String content) {
    }
}
