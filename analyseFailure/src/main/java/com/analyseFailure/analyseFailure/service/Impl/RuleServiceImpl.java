package com.analyseFailure.analyseFailure.service.Impl;

import com.analyseFailure.analyseFailure.dto.RuleDto;
import com.analyseFailure.analyseFailure.entity.Rule;
import com.analyseFailure.analyseFailure.exception.ResourceNotFoundException;
import com.analyseFailure.analyseFailure.mapper.RuleMapper;
import com.analyseFailure.analyseFailure.repository.RuleRepository;
import com.analyseFailure.analyseFailure.service.RuleService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class RuleServiceImpl implements RuleService {

    @Autowired
    private RuleRepository ruleRepository;

    @Override
    public RuleDto createRule(RuleDto ruleDto) {
        Rule rule  = RuleMapper.mapToRule(ruleDto);
        Rule savedRule = ruleRepository.save(rule);

        return  RuleMapper.mapToRuleDto(savedRule);
    }

    public RuleDto updateRule(String ruleName, RuleDto ruleDto) {
        Rule existingRule = ruleRepository.findByRuleName(ruleName)
                .orElseThrow(() -> new ResourceNotFoundException("Rule not found with rule name: " + ruleName));
        existingRule.setRuleName(ruleDto.getRuleName());
        existingRule.setValue(ruleDto.getValue());
        Rule updatedRule = ruleRepository.save(existingRule);
//        return modelMapper.map(updatedRule, RuleDto.class);
        return  RuleMapper.mapToRuleDto(updatedRule);

    }


}
