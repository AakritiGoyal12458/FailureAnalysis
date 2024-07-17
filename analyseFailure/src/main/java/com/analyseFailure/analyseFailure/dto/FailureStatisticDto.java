package com.analyseFailure.analyseFailure.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FailureStatisticDto {

        private Long id;
        private String featureName;
        private double executionPercentage;
        private Date executionDate;
        private Long buildNumber;

}
