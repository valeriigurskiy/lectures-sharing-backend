package lecturesharingproject.lecturesharing.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 64)
    private String name;
    @Column(nullable = false, length = 32)
    private String address;
    @Column(nullable = false, length = 256)
    private String pictureURL;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "university_id")
    private List<Teacher> teachers;


}
