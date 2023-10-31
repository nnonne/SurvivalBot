package demo.SurvivalBot.inventory;

import demo.SurvivalBot.inventory.items.Item;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "character_id")
    private int characterId;
    @ManyToMany
    @JoinColumn
    private Item item;
    private int quantity;
    private int durability;
}
