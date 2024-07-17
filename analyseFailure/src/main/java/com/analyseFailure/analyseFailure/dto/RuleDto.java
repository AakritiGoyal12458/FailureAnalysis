package com.analyseFailure.analyseFailure.dto;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RuleDto {

    private Long id;
    private String ruleName;
    private int value;

}
