package com.analyseFailure.analyseFailure.mapper;

import com.analyseFailure.analyseFailure.dto.FailureStatisticDto;
import com.analyseFailure.analyseFailure.entity.FailureStatistic;

public class FailureStatisticMapper {

    public static FailureStatisticDto mapToFailureStatisticDto(FailureStatistic failureStatistic){
        return new FailureStatisticDto(
                failureStatistic.getId(),
                failureStatistic.getFeatureName(),
                failureStatistic.getExecutionPercentage(),
                failureStatistic.getExecutionDate(),
                failureStatistic.getBuildNumber()


        );
    }
    public static FailureStatistic mapToFailureStatistic(FailureStatisticDto failureStatisticDto){
        return new FailureStatistic(
                failureStatisticDto.getId(),
                failureStatisticDto.getFeatureName(),
                failureStatisticDto.getExecutionPercentage(),
                failureStatisticDto.getExecutionDate(),
                failureStatisticDto.getBuildNumber()
        );


    }
}
