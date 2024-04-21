package com.spring.social_media_application.service;

import com.spring.social_media_application.comman.CommonResponse;
import com.spring.social_media_application.dto.WorkoutStatusDTO;

public interface WorkoutStatusService {
    /**
     * Get all workout status
     *
     * @return success or fail response of workout status creation
     */
    CommonResponse getAllWorkoutStatusDetails();

    /**
     * Get workout status by id
     *
     * @param workoutStatusId - required data for get workout status by id
     * @return success or fail response of get workout status by id
     */
    CommonResponse getWorkoutStatusDetailsById(Long workoutStatusId);

    /**
     * Create workout status
     *
     * @param workoutStatusDTO - required data for workout status save
     * @return success or fail response of workout status save
     */
    CommonResponse saveWorkoutStatus(WorkoutStatusDTO workoutStatusDTO);

    /**
     * Update workout status
     *
     * @param workoutStatusDTO - required data for workout status update
     * @return success or fail response of workout status update
     */
    CommonResponse updateWorkoutStatus(WorkoutStatusDTO workoutStatusDTO);

    /**
     * Delete workout status by id
     *
     * @param workoutStatusId - required data for delete workout status by id
     * @return success or fail response of delete workout status by id
     */
    CommonResponse deleteWorkoutStatusDetailsById(Long workoutStatusId);
}
