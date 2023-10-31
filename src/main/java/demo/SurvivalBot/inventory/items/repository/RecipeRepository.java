package demo.SurvivalBot.inventory.items.repository;

import demo.SurvivalBot.inventory.items.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Item, Item> {
}
