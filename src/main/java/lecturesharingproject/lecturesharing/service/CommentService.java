package lecturesharingproject.lecturesharing.service;

import lecturesharingproject.lecturesharing.dao.CommentDao;
import lecturesharingproject.lecturesharing.dao.LectureDao;
import lecturesharingproject.lecturesharing.entity.Comment;
import lecturesharingproject.lecturesharing.entity.Lecture;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CommentService implements ICommentService{

    @Autowired
    private CommentDao commentDao;


    @Override
    public Comment insertComment(Comment comment) {
        return commentDao.save(comment);
    }

    @Override
    public List<Comment> getAllComments() {
        return commentDao.findAll();
    }

    @Override
    public Comment getComment(int id) {
        return commentDao.getOne(id);
    }

    @Override
    public void removeComment(int id) {
        commentDao.deleteById(id);
    }
}
