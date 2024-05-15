package com.paf.gymapplication.controller.Post;

//comment controller
import com.paf.gymapplication.model.Post.Comment;
import com.paf.gymapplication.service.Post.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/commentService")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/save")
    public Comment saveComment(@RequestBody Comment comment)
    {
        return commentService.saveComment(comment);
    }

    //get all comment for one postId
    @GetMapping("/getAllComments/{postId}")
    public ArrayList<Comment> getAllComments(@PathVariable("postId") UUID postId)
    {
        return commentService.getAllComments(postId);
    }


}

