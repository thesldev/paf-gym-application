package com.paf.gymapplication.repository.WorkoutStatus;

import com.paf.gymapplication.model.WorkoutStatus.WorkoutstatusComment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface WorkoutstatusCommentRepo extends MongoRepository<WorkoutstatusComment, String> {

    WorkoutstatusComment save(WorkoutstatusComment workoutstatusComment);

    ArrayList<WorkoutstatusComment> findAllBystatusId(UUID statusId);
}