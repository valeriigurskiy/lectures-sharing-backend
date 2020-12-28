package lecturesharingproject.lecturesharing.controller;

import lecturesharingproject.lecturesharing.entity.Comment;
import lecturesharingproject.lecturesharing.entity.Lecture;
import lecturesharingproject.lecturesharing.service.CommentService;
import lecturesharingproject.lecturesharing.service.LectureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
@Slf4j
public class CommentController {

    @Autowired
    private CommentService commentService;

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<Comment> getLectures() {
        return commentService.getAllComments();
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/{id}")
    public Comment findCommentById(@PathVariable int id){
        return commentService.getComment(id);
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public Comment insertComment(@RequestBody Comment comment) {
        Comment newComment = new Comment(comment.getId(), comment.getContent());
        return commentService.insertComment(newComment);
    }
}
