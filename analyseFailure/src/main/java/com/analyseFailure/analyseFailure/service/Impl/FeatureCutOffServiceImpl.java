//package com.analyseFailure.analyseFailure.service.Impl;
//
//import com.analyseFailure.analyseFailure.service.FeatureCutOffService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import java.util.List;
//
//public class FeatureCutOffServiceImpl {
//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public FeatureCutOffServiceImpl(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public List<String> getFeatureCutoff() {
//        String sql = "SELECT * FROM feature_cutoff";
//        return jdbcTemplate.query(sql, (rs, rowNum) -> rs.getString("feature_name"));
//    }
//
//}
