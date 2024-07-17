package com.analyseFailure.analyseFailure.service;

import com.analyseFailure.analyseFailure.dto.RuleDto;

public interface RuleService {

    RuleDto createRule(RuleDto ruleDto);

    RuleDto updateRule(String ruleName, RuleDto ruleDto);
}
