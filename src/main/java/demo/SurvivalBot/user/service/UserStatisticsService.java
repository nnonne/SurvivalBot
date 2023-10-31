package demo.SurvivalBot.user.service;

import demo.SurvivalBot.user.UserStatistics;
import demo.SurvivalBot.user.repository.UserStatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserStatisticsService {
    private final UserStatisticsRepository userStatisticsRepository;

    @Autowired
    public UserStatisticsService(UserStatisticsRepository userStatisticsRepository) {
        this.userStatisticsRepository = userStatisticsRepository;
    }

    public UserStatistics createUserStatistics(UserStatistics userStatistics) {
        return userStatisticsRepository.save(userStatistics);
    }

    public List<UserStatistics> getAllUserStatistics() {
        return userStatisticsRepository.findAll();
    }

    public Optional<UserStatistics> getUserStatisticsById(Long userStatisticsId) {
        return userStatisticsRepository.findById(userStatisticsId);
    }

    public void updateUserStatistics(UserStatistics userStatistics) {
        userStatisticsRepository.save(userStatistics);
    }

    public void deleteUserStatistics(Long userStatisticsId) {
        userStatisticsRepository.deleteById(userStatisticsId);
    }
}
