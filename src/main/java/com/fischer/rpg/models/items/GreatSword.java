package com.fischer.rpg.models.items;

import lombok.Getter;

@Getter
public class GreatSword extends Weapon {

    public GreatSword(String name, String description, int value, int weight, int diceSize, int dices) {
        super(name, description, value, weight, diceSize, dices, true);
    }
}
