package demo.SurvivalBot.inventory.items;

import jakarta.persistence.*;

@Entity
@Table(name = "food")
public class Food extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn
    private Item item;
    @Column
    private int hydration;
    @Column
    private int stamina;
    @Column
    private int health;
    @Column
    private int temperature;
    @Column
    private int calories;
    @Column
    private int spirit;


}
