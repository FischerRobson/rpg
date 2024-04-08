package com.fischer.rpg.models.items;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Armour extends Item{
    private int armourClass;

    public Armour(String name, String description, int value, int weight, int armourClass) {
        super(name, description, value, weight);
        this.armourClass = armourClass;
    }
}
