package com.spring.social_media_application.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class WorkoutStatus {
    @Id
    private Long id;
    @Field
    private String distance;
    @Field
    private Integer pushUp;
    @Field
    private Double weightLifted;
}
