package com.analyseFailure.analyseFailure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="rules")
public class Rule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "rule_name")
    private String ruleName;
    //    @Column(name="cutOff")
    //    private int cutOff;

    @Column(name = "value")
    private int value;


}
