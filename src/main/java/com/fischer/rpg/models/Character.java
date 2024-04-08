package com.fischer.rpg.models;

import com.fischer.rpg.factory.SkillFactory;
import com.fischer.rpg.models.items.*;
import com.fischer.rpg.models.skills.Skill;
import com.fischer.rpg.models.skills.SkillsName;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;

@Getter
@Setter
public class Character {
    private String name;
    private int level;
    private int lifePoints;

    // SKILLS
    private HashMap<SkillsName, Skill> skills;

    // INVENTORY
    private ArrayList<Item> items;

    // EQUIPMENT
    private Helmet helmet;
    private Chest chest;
    private Gloves gloves;
    private Boots boots;

    private Weapon rightHand;
    // private Weapon leftHand;

    public Character(String name, int lifePoints) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.level = 1;
        this.skills = SkillFactory.fabricateSkills();
        this.items = new ArrayList<>();
    }

    public void levelUp(SkillsName skill) {
        this.level++;
        this.skills.get(skill).levelUp();
    }

    public int getArmourClass() {
        return 0;
    }

    public String getDamage() {
        return this.rightHand.getDices() + "d" + this.getRightHand().getDiceSize();
    }

}
