package demo.SurvivalBot.user.repository;

import demo.SurvivalBot.user.UserStatistics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserStatisticsRepository extends JpaRepository<UserStatistics, Long> {
}