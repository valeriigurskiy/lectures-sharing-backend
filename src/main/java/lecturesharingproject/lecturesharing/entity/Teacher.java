package lecturesharingproject.lecturesharing.entity;

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
    @Column(nullable = false, length = 20)
    private String university;



}
