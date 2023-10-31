package demo.SurvivalBot.user.service;

import demo.SurvivalBot.user.UserStatistics;
import demo.SurvivalBot.user.repository.UserStatisticsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserStatisticsServiceTest {
    @InjectMocks
    private UserStatisticsService userStatisticsService;

    @Mock
    private UserStatisticsRepository userStatisticsRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateUserStatistics() {
        UserStatistics userStatistics = new UserStatistics(/* Initialize with data */);
        when(userStatisticsRepository.save(any(UserStatistics.class))).thenReturn(userStatistics);

        UserStatistics savedUserStatistics = userStatisticsService.createUserStatistics(userStatistics);

        assertNotNull(savedUserStatistics);
        //assertEquals(/* Verify if the savedUserStatistics matches the expected values */);
    }

    @Test
    public void testGetAllUserStatistics() {
        List<UserStatistics> userStatisticsList = new ArrayList<>();
        // Populate userStatisticsList with test data
        when(userStatisticsRepository.findAll()).thenReturn(userStatisticsList);

        List<UserStatistics> retrievedUserStatistics = userStatisticsService.getAllUserStatistics();

        assertEquals(userStatisticsList.size(), retrievedUserStatistics.size());
        // Add more assertions as needed to compare the actual and expected data.
    }

    @Test
    public void testGetUserStatisticsById() {
        Long userStatisticsId = 1L;
        UserStatistics userStatistics = new UserStatistics(/* Initialize with data */);
        when(userStatisticsRepository.findById(userStatisticsId)).thenReturn(Optional.of(userStatistics));

        Optional<UserStatistics> retrievedUserStatistics = userStatisticsService.getUserStatisticsById(userStatisticsId);

        assertTrue(retrievedUserStatistics.isPresent());
        assertEquals(userStatisticsId, retrievedUserStatistics.get().getId());
        // Add more assertions to verify other fields.
    }

    // Similarly, write tests for updateUserStatistics and deleteUserStatistics methods.
}