package net.frohlich.random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiceRollerTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void should_roll_d6() throws Exception {
        String code = "d6";
        int min = 1;
        int max = 6;
        for (int i = 0; i < max*2; i++) {
            int roll = DiceRoller.roll(code);

            String message = String.format("roll %s=>%d was less than %d", code, roll, min);
            Assert.assertTrue(message, roll >= min);

            String message2 = String.format("roll %s=>%d was not less than %d", code, roll, max);
            Assert.assertTrue(message2, roll <= max);
        }
    }

    @Test
    public void should_roll_D6() throws Exception {
        String code = "D6";
        int min = 1;
        int max = 6;
        for (int i = 0; i < max*2; i++) {
            int roll = DiceRoller.roll(code);

            String message = String.format("roll %s=>%d was less than %d", code, roll, min);
            Assert.assertTrue(message, roll >= min);

            String message2 = String.format("roll %s=>%d was not less than %d", code, roll, max);
            Assert.assertTrue(message2, roll <= max);
        }
    }

    @Test
    public void should_roll_D12() throws Exception {
        String code = "D12";
        int min = 1;
        int max = 12;
        for (int i = 0; i < max*2; i++) {
            int roll = DiceRoller.roll(code);

            String message = String.format("roll %s=>%d was less than %d", code, roll, min);
            Assert.assertTrue(message, roll >= min);

            String message2 = String.format("roll %s=>%d was not less than %d", code, roll, max);
            Assert.assertTrue(message2, roll <= max);
        }
    }

    @Test
    public void should_roll_d100() throws Exception {
        String code = "d100";
        int min = 1;
        int max = 100;
        for (int i = 0; i < max*2; i++) {
            int roll = DiceRoller.roll(code);

            String message = String.format("roll %s=>%d was less than %d", code, roll, min);
            Assert.assertTrue(message, roll >= min);

            String message2 = String.format("roll %s=>%d was not less than %d", code, roll, max);
            Assert.assertTrue(message2, roll <= max);
        }
    }

    @Test
    public void should_roll_3d6() throws Exception {
        String code = "3d6";
        int min = 3;
        int max = 18;
        for (int i = 0; i < max*2; i++) {
            int roll = DiceRoller.roll(code);

            String message = String.format("roll %s=>%d was less than %d", code, roll, min);
            Assert.assertTrue(message, roll >= min);

            String message2 = String.format("roll %s=>%d was not less than %d", code, roll, max);
            Assert.assertTrue(message2, roll <= max);
        }
    }

    @Test
    public void should_roll_D20() throws Exception {
        String code = "D20";
        int min = 1;
        int max = 20;
        for (int i = 0; i < max*2; i++) {
            int roll = DiceRoller.roll(code);

            String message = String.format("roll %s=>%d was less than %d", code, roll, min);
            Assert.assertTrue(message, roll >= min);

            String message2 = String.format("roll %s=>%d was not less than %d", code, roll, max);
            Assert.assertTrue(message2, roll <= max);
        }
    }
}
