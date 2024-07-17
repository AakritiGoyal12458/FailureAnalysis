package com.analyseFailure.analyseFailure.service;

import com.analyseFailure.analyseFailure.dto.FailureStatisticDto;

import java.util.List;

public interface FailureStatisticService {

    FailureStatisticDto createFailure(FailureStatisticDto failureStatisticDto);
    FailureStatisticDto getFeatureByExecutionPercentage(  double executionPercentage, String buildNumber);


    List<String> getFeatureCutoff();
}
