package com.paf.gymapplication.service.WorkoutStatus;

import com.paf.gymapplication.model.WorkoutStatus.WorkoutstatusComment;
import com.paf.gymapplication.repository.WorkoutStatus.WorkoutstatusCommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

@Service
public class WorkoutstatusCommentService {

    @Autowired
    WorkoutstatusCommentRepo workoutstatusCommentRepo;

    public WorkoutstatusComment saveWorkoutstatusComment(WorkoutstatusComment workoutstatusComment)
    {
        // Set creation timestamp
        LocalDateTime datetime = LocalDateTime.now();


        workoutstatusComment.setDateTime(datetime);

        return workoutstatusCommentRepo.save(workoutstatusComment);
    }

    //get all comment for one postId
    public ArrayList<WorkoutstatusComment> getAllWorkoutstatusComments(UUID statusId)
    {
        return workoutstatusCommentRepo.findAllBystatusId(statusId);
    }
}
