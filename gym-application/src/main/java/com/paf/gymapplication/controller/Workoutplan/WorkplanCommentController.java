package com.paf.gymapplication.controller.Workoutplan;


import com.paf.gymapplication.model.Workoutplan.WorkplanComment;
import com.paf.gymapplication.service.Workoutplan.WorkplanCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/workplancommentService")
public class WorkplanCommentController {

    @Autowired
    WorkplanCommentService workplanCommentService;

    @PostMapping("/save")
    public WorkplanComment saveWorkplanComment(@RequestBody WorkplanComment workplanComment)
    {
        return workplanCommentService.saveWorkplanComment(workplanComment);
    }

    //get all comment for one postId
    @GetMapping("/getAllComments/{planId}")
    public ArrayList<WorkplanComment> getAllWorkplanComments(@PathVariable("planId") UUID planId)
    {
        return workplanCommentService.getAllWorkplanComment(planId);
    }
}

