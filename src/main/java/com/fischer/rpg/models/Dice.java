package com.fischer.rpg.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Dice {

    private static final Random random = new Random();

    public static int rollD20() {
        return random.nextInt(20) + 1;
    }

    public static int rollDice(int size) {
        return random.nextInt(20) + 1;
    }

}
