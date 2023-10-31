package demo.SurvivalBot.inventory.items;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_en")
    private String nameEN;
    @Column(name = "description_en")
    private String descriptionEN;
    @Column(name = "name_ua")
    private String nameUA;
    @Column(name = "description_ua")
    private String descriptionUA;

    @Column(name = "inventory_space_required")
    private int inventorySpaceRequired;
    @Column
    private int durability;
    @ManyToMany
    @JoinColumn(name = "item_group")
    private List<ItemGroup> itemGroups;


}