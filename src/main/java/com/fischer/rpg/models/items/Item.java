package com.fischer.rpg.models.items;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Item {
    private String name;
    private String description;
    private int value;
    private int weight;

    public Item(String name, String description, int value, int weight) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.weight = weight;
    }
}
