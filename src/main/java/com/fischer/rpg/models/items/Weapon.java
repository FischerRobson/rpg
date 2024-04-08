package com.fischer.rpg.models.items;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Weapon extends Item {
    private final int diceSize; // number of dices sides
    private final int dices; // number of dices
    private final boolean isTwoHanded;

    public Weapon(String name, String description, int value, int weight, int diceSize, int dices, boolean isTwoHanded) {
        super(name, description, value, weight);
        this.diceSize = diceSize;
        this.dices = dices;
        this.isTwoHanded = isTwoHanded;
    }
}
