package com.paf.gymapplication.repository.Post;

import com.paf.gymapplication.model.Post.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface CommentRepo extends MongoRepository<Comment, String> {

    Comment save(Comment comment);

    //get all comment for one postId
    ArrayList<Comment> findAllByPostId(UUID postId);


}