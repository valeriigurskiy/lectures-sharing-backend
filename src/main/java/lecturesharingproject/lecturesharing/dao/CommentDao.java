package lecturesharingproject.lecturesharing.dao;

import lecturesharingproject.lecturesharing.entity.Comment;
import lecturesharingproject.lecturesharing.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentDao extends JpaRepository<Comment, Integer> {
}
