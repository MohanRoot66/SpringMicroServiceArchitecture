package com.fitness.aiservice.service;

import com.fitness.aiservice.model.Recommendation;
import com.fitness.aiservice.repository.RecommendationRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecommendationService {
    private final RecommendationRepo recommendationRepo;

    public List<Recommendation> getUserRecommendations(String userId) {
        return recommendationRepo.findByUserId(userId);
    };

    public Recommendation getActivityRecommendations(String activityId) {
        return  recommendationRepo.findByActivityId(activityId).orElseThrow(
                () -> new RuntimeException("Recommendations are not available for this: "+activityId)
        );
    }
}
