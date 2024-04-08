package com.fischer.rpg.models.skills;

public class Skill {
    private SkillsName name;
    private int level;

    public Skill(SkillsName name, int level) {
        this.name = name;
        this.level = level;
    }

    public void levelUp() {
        this.level++;
    }

}
