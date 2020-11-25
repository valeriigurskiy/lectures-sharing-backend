package lecturesharingproject.lecturesharing.entity;

public class Lecture {
    private int id;
    private LessonName lessonName;
    private String title;
    private String lessonDescription;

    public Lecture(int id, LessonName lessonName, String title, String lessonDescription) {
        this.id = id;
        this.lessonName = lessonName;
        this.title = title;
        this.lessonDescription = lessonDescription;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LessonName getLessonName() {
        return lessonName;
    }

    public void setLessonName(LessonName lessonName) {
        this.lessonName = lessonName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLessonDescription() {
        return lessonDescription;
    }

    public void setLessonDescription(String lessonDescription) {
        this.lessonDescription = lessonDescription;
    }
}
