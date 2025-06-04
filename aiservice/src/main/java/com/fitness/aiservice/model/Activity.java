package com.fitness.aiservice.model;

import lombok.Data;
import org.bson.types.ObjectId;
import java.time.LocalDateTime;
import java.util.Map;

@Data
public class Activity {

    private ObjectId id;
    private String type;
    private String userId;
    private Integer duration;
    private Integer caloriesBurnt;
    private LocalDateTime startTime;
    private Map<String,Object> additionalMetrics;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
