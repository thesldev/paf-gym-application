package com.paf.gymapplication.controller.WorkoutStatus;


import com.paf.gymapplication.model.WorkoutStatus.WorkoutstatusComment;
import com.paf.gymapplication.service.WorkoutStatus.WorkoutstatusCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/workoutstatuscommentService")
public class WorkoutstatusCommentController {

    @Autowired
    WorkoutstatusCommentService workoutstatusCommentService;

    @PostMapping("/save")
    public WorkoutstatusComment saveWorkoutstatusComment(@RequestBody WorkoutstatusComment workoutstatusComment)
    {
        return workoutstatusCommentService.saveWorkoutstatusComment(workoutstatusComment);
    }

    //get all comment for one postId
    @GetMapping("/getAllComments/{statusId}")
    public ArrayList<WorkoutstatusComment> getAllWorkoutstatusComments(@PathVariable("statusId") UUID statusId)
    {
        return workoutstatusCommentService.getAllWorkoutstatusComments(statusId);
    }
}
