package com.analyseFailure.analyseFailure.service.Impl;

import com.analyseFailure.analyseFailure.dto.FailureStatisticDto;
import com.analyseFailure.analyseFailure.entity.FailureStatistic;
import com.analyseFailure.analyseFailure.mapper.FailureStatisticMapper;
import com.analyseFailure.analyseFailure.repository.FailureStatisticRepository;
import com.analyseFailure.analyseFailure.service.FailureStatisticService;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class FailureStatisticServiceImpl implements FailureStatisticService {


    private FailureStatisticRepository failureStatisticRepository;
    private final JdbcTemplate jdbcTemplate;  // Add JdbcTemplate

    @Override
    public FailureStatisticDto createFailure(FailureStatisticDto failureStatisticDto) {

        FailureStatistic failureStatistic = FailureStatisticMapper.mapToFailureStatistic(failureStatisticDto);
        FailureStatistic savedFailure =    failureStatisticRepository.save(failureStatistic);
        return FailureStatisticMapper.mapToFailureStatisticDto(savedFailure);

    }

    @Override
    public FailureStatisticDto getFeatureByExecutionPercentage(double executionPercentage, String buildNumber) {
        return null;
    }

    public List<String> getFeatureCutoff() {
        String sql = "SELECT * FROM feature_cutoff";
        return jdbcTemplate.query(sql, (rs, rowNum) -> rs.getString("feature_name"));
    }


}
