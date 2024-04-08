package com.fischer.rpg;


import com.fischer.rpg.models.Character;

import static com.fischer.rpg.factory.WeaponsFactory.*;

public class RPG {

    public static void main(String... args) {
        Character bob = new Character("Bob", 10);
        bob.setRightHand(makeClaymore());
        System.out.println(bob.getDamage());
    }

}
