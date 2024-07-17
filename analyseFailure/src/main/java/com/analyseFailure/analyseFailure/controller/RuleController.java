package com.analyseFailure.analyseFailure.controller;


import com.analyseFailure.analyseFailure.dto.RuleDto;
import com.analyseFailure.analyseFailure.service.RuleService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/rule")
public class RuleController {

    @Autowired
    private RuleService ruleService;

    //Build Add Failure Rest api
    @PostMapping
    public ResponseEntity<RuleDto> createEmployee(@RequestBody RuleDto ruleDto){
        RuleDto savedRule = ruleService.createRule(ruleDto);

        return new ResponseEntity<>(savedRule, HttpStatus.CREATED);
    }

    @PutMapping("/{ruleName}")
    public ResponseEntity<RuleDto> updateRule(@PathVariable String ruleName, @RequestBody RuleDto ruleDto) {
        RuleDto updatedRule = ruleService.updateRule(ruleName, ruleDto);
        return new ResponseEntity<>(updatedRule, HttpStatus.OK);
    }




}
