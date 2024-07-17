package com.analyseFailure.analyseFailure.controller;

import com.analyseFailure.analyseFailure.dto.FailureStatisticDto;
import com.analyseFailure.analyseFailure.service.FailureStatisticService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/api/failure_statistic")
public class FailureStatisticController {

    private FailureStatisticService failureStatisticService;

    //Build Add Failure Rest api
    @PostMapping
    public ResponseEntity<FailureStatisticDto> createEmployee(@RequestBody FailureStatisticDto failureStatisticDto){
        FailureStatisticDto savedFailure =  failureStatisticService.createFailure(failureStatisticDto);
        return new ResponseEntity<>(savedFailure, HttpStatus.CREATED);
    }

    @GetMapping("/feature_cutoff")
    public ResponseEntity<List<String>> getFeatureCutoff() {
        List<String> featureNames = failureStatisticService.getFeatureCutoff();
        return new ResponseEntity<>(featureNames, HttpStatus.OK);
    }





}
