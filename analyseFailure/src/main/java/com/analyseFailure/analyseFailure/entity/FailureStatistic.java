package com.analyseFailure.analyseFailure.entity;

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
@Entity
@Table(name="failure_statistic")
public class FailureStatistic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)

    private Long id;

    @Column(name = "feature_name")
    private String featureName;

    @Column(name = "execution_percentage")
    private double executionPercentage;

    @Column(name = "execution_date")
    private Date executionDate;

    @Column(name = "build_number",nullable = true,unique = true)
    private Long buildNumber;

}
