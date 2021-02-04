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
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 15)
    private String name;
    @Column(nullable = false, length = 15)
    private String lastname;
    @Column(nullable = false, length = 16)
    private String login;
    @Column(nullable = false, length = 32)
    private String password;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String university;
    @Column()
    private String universityname;
}
