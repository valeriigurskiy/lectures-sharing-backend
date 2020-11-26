package lecturesharingproject.lecturesharing.entity;

import javax.persistence.Column;

public class Teacher {

    @Column(nullable = false, length = 15)
    private String name;
    @Column(nullable = false, length = 15)
    private String lastname;
    @Column(nullable = false, length = 16)
    private String login;
    @Column(nullable = false, length = 20)
    private String university;



}
