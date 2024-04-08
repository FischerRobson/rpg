package com.fischer.rpg.factory;

import com.fischer.rpg.models.skills.*;

import java.util.HashMap;

public class SkillFactory {
    public static HashMap<SkillsName, Skill> fabricateSkills() {
        HashMap<SkillsName, Skill> skills = new HashMap<>();
        skills.put(SkillsName.CONSTITUTION, new Constitution());
        skills.put(SkillsName.INTELLIGENCE, new Intelligence());
        skills.put(SkillsName.STRENGTH, new Strength());

        return skills;
    }
}
