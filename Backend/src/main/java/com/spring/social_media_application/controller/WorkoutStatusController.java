package com.spring.social_media_application.controller;

import com.spring.social_media_application.comman.CommonResponse;
import com.spring.social_media_application.dto.WorkoutStatusDTO;
import com.spring.social_media_application.service.WorkoutStatusService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workout")
@Slf4j
@AllArgsConstructor
public class WorkoutStatusController {
    private final WorkoutStatusService workoutStatusService;

    /**
     * Get all workout status
     *
     * @return success or fail response of workout status creation
     */
    @GetMapping("")
    public ResponseEntity<CommonResponse> getAllWorkoutStatusDetails() {
        CommonResponse commonResponse = workoutStatusService.getAllWorkoutStatusDetails();
        return new ResponseEntity<>(commonResponse, HttpStatus.OK);
    }

    /**
     * Get workout status by id
     *
     * @param workoutStatusId - required data for get workout status by id
     * @return success or fail response of get workout status by id
     */
    @GetMapping("/{workoutStatusId}")
    public ResponseEntity<CommonResponse> getWorkoutStatusDetailsById(@PathVariable("workoutStatusId") @NotNull Long workoutStatusId) {
        CommonResponse commonResponse = workoutStatusService.getWorkoutStatusDetailsById(workoutStatusId);
        return new ResponseEntity<>(commonResponse, HttpStatus.OK);
    }

    /**
     * Create workout status
     *
     * @param workoutStatusDTO - required data for workout status save
     * @return success or fail response of workout status save
     */
    @PostMapping("")
    public ResponseEntity<CommonResponse> saveWorkoutStatus(@Valid @RequestBody WorkoutStatusDTO workoutStatusDTO) {
        CommonResponse commonResponse = workoutStatusService.saveWorkoutStatus(workoutStatusDTO);
        return new ResponseEntity<>(commonResponse, HttpStatus.OK);
    }

    /**
     * Update workout status
     *
     * @param workoutStatusDTO - required data for workout status update
     * @return success or fail response of workout status update
     */
    @PutMapping("")
    public ResponseEntity<CommonResponse> updateWorkoutStatus(@Valid @RequestBody WorkoutStatusDTO workoutStatusDTO) {
        CommonResponse commonResponse = workoutStatusService.updateWorkoutStatus(workoutStatusDTO);
        return new ResponseEntity<>(commonResponse, HttpStatus.OK);
    }

    /**
     * Delete workout status by id
     *
     * @param workoutStatusId - required data for delete workout status by id
     * @return success or fail response of delete workout status by id
     */
    @DeleteMapping("/{workoutStatusId}")
    public ResponseEntity<CommonResponse> deleteWorkoutStatusDetailsById(@PathVariable("workoutStatusId") @NotNull Long workoutStatusId) {
        CommonResponse commonResponse = workoutStatusService.deleteWorkoutStatusDetailsById(workoutStatusId);
        return new ResponseEntity<>(commonResponse, HttpStatus.OK);
    }
}
