CREATE VIEW feature_cutoff AS
WITH latest_builds AS (
    SELECT DISTINCT build_number
    FROM failure_statistic
    ORDER BY build_number DESC
    LIMIT (SELECT value FROM rules WHERE rule_name = 'pastExecution')
)
SELECT DISTINCT f.feature_name
FROM failure_statistic f
JOIN rules r ON f.execution_percentage < r.value
WHERE r.rule_name = 'cutOff' AND f.build_number IN (SELECT build_number FROM latest_builds);
