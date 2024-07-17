package com.analyseFailure.analyseFailure.repository;

import com.analyseFailure.analyseFailure.entity.FailureStatistic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FailureStatisticRepository extends JpaRepository<FailureStatistic,Long> {
}
