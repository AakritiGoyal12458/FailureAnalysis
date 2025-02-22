package com.analyseFailure.analyseFailure.repository;

import com.analyseFailure.analyseFailure.entity.Rule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RuleRepository extends JpaRepository<Rule,Long> {
    Optional<Rule> findByRuleName(String ruleName);
}
