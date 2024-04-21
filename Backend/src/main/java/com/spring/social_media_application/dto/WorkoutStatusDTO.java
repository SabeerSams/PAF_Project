package com.spring.social_media_application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WorkoutStatusDTO {
    private Long id;
    private String distance;
    private Integer pushUp;
    private Double weightLifted;
}
