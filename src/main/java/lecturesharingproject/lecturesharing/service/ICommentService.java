package lecturesharingproject.lecturesharing.service;

import lecturesharingproject.lecturesharing.entity.Comment;
import lecturesharingproject.lecturesharing.entity.Lecture;

import java.util.List;

public interface ICommentService {

    Comment insertComment(Comment comment);

    List<Comment> getAllComments();

    Comment getComment(int id);

    void removeComment(int id);

}
