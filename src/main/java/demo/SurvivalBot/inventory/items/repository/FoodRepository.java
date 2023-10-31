package demo.SurvivalBot.inventory.items.repository;

import demo.SurvivalBot.inventory.items.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
