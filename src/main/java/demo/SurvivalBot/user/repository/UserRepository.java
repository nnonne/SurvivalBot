package demo.SurvivalBot.user.repository;

import demo.SurvivalBot.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
