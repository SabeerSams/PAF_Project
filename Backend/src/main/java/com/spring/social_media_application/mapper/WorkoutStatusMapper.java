package com.spring.social_media_application.mapper;

import com.spring.social_media_application.dto.WorkoutStatusDTO;
import com.spring.social_media_application.entity.WorkoutStatus;
import com.spring.social_media_application.exception.ReferenceNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class WorkoutStatusMapper {
    public WorkoutStatus dtoToDomain(WorkoutStatusDTO dto, WorkoutStatus domain) {
        if (dto == null) {
            throw new ReferenceNotFoundException("The WorkoutStatusDTO should not be null");
        }
        domain.setId(dto.getId());
        domain.setDistance(dto.getDistance());
        domain.setPushUp(dto.getPushUp());
        domain.setWeightLifted(dto.getWeightLifted());
        return domain;
    }

    public WorkoutStatusDTO domainToDto(WorkoutStatus domain) {
        if (domain == null) {
            throw new ReferenceNotFoundException("The WorkoutStatus should not be null");
        }
        WorkoutStatusDTO dto = new WorkoutStatusDTO();
        dto.setId(domain.getId());
        dto.setDistance(domain.getDistance());
        dto.setPushUp(domain.getPushUp());
        dto.setWeightLifted(domain.getWeightLifted());
        return dto;
    }
}
