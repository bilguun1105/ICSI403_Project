package com.mojang.mario.sprites;

import com.mojang.mario.LevelScene;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MarioTest {

    private Mario mario;
    private float alpha = 0.000000001F;
    @BeforeEach
    public void setUp() {
        mario = new Mario(new LevelScene(null, null, 0, 1, 1));
    }

    @Test
    public void testInitial() {

        System.out.println((int) mario.getX(alpha));
        assertEquals(Float.parseFloat("Initial X position should be 0"), 1, (int) mario.getX(alpha));
        assertEquals(Float.parseFloat("Initial X position should be 0"), 1, (int) mario.getY(alpha));

    }
}
