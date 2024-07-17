package com.analyseFailure.analyseFailure.mapper;

import com.analyseFailure.analyseFailure.dto.FailureStatisticDto;
import com.analyseFailure.analyseFailure.dto.RuleDto;
import com.analyseFailure.analyseFailure.entity.FailureStatistic;
import com.analyseFailure.analyseFailure.entity.Rule;

public class RuleMapper {

    public static RuleDto mapToRuleDto(Rule rule){
        return new RuleDto(
                rule.getId(),
                rule.getRuleName(),
                rule.getValue()

        );
    }
    public static Rule mapToRule(RuleDto ruleDto){
        return new Rule(
                ruleDto.getId(),
                ruleDto.getRuleName(),
                ruleDto.getValue()
        );
    }

}
