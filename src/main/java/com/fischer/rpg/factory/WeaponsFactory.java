package com.fischer.rpg.factory;

import com.fischer.rpg.models.items.GreatSword;
import com.fischer.rpg.models.items.Sword;

public class WeaponsFactory {
    public static Sword makeCommonSword(){
        Sword sword = new Sword("Common Sword", "A common metal sword",
                10, 5, 6, 1); // 1d6
        return sword;
    }

    public static Sword makeFineSword(){
        Sword sword = new Sword("Fine Sword", "Fine sword, used by Lords and Princes",
                60, 7, 5, 2); // 2d5
        return sword;
    }

    public static Sword makeDragonSword(){
        Sword sword = new Sword("Dragon Sword",
                "A powerful sword, crafted by ancients dwarves using dragon bones",
                1500, 10, 10, 2); // 2d10
        return sword;
    }

    public static GreatSword makeCommonGreatSword() {
        GreatSword greatSword = new GreatSword("Common GreatSword", "A exceptional great sword",
                20, 15, 10, 1); // 1d10
        return  greatSword;
    }

    public static GreatSword makeClaymore() {
        GreatSword greatSword = new GreatSword("Claymore", "Claymore is a lightweight and powerful greatsword",
                50, 12, 7, 2); // 2d7
        return  greatSword;
    }
}
