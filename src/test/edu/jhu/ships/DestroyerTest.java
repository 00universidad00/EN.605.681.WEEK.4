package edu.jhu.ships;

import main.edu.jhu.ships.Destroyer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DestroyerTest {
    @Test
    public void testNewDestroyer() {
        // create destroyer 1
        Destroyer destroyer1 = new Destroyer("Destroyer 1", 10, "Generic", 4);
        // print destroyer
        System.out.println(destroyer1);
        // create destroyer 2
        Destroyer destroyer2 = new Destroyer("Destroyer 2", 10, "Generic", 8);
        // print destroyer
        System.out.println(destroyer2);
    }

    @Test
    public void testSetAndGetName() {
        // Define valid name for the destroyer
        final String ORIGINAL_NAME = "Original Destroyer Name";
        // Define valid name for the destroyer
        final String NEW_NAME = "New Destroyer name";
        // create a new Destroyer
        Destroyer destroyer = new Destroyer(ORIGINAL_NAME, 10, "Test Type", 0);
        // validate that destroyer has the original name
        assertEquals(ORIGINAL_NAME, destroyer.getName());
        // set name tu null and verify if destroyer keeps old name
        destroyer.setName(null);
        // validate that destroyer has the original name
        assertEquals(ORIGINAL_NAME, destroyer.getName());
        // set name tu new name and verify if destroyer gets the new name
        destroyer.setName(NEW_NAME);
        assertEquals(NEW_NAME, destroyer.getName());
    }

    @Test
    public void testSetAndGetType() {
        // Define valid type for the destroyer
        final String ORIGINAL_TYPE = "Original Destroyer Type";
        // Define valid new type for the destroyer
        final String NEW_TYPE = "New Destroyer Type";
        // create a new destroyer
        Destroyer destroyer = new Destroyer("New Destroyer", 10, ORIGINAL_TYPE, 0);
        // validate that destroyer has the type passed by the constructor
        assertEquals(ORIGINAL_TYPE, destroyer.getType());
        // set type tu null and verify if submarine keeps old name
        destroyer.setType(null);
        // validate that destroyer has the original type
        assertEquals(ORIGINAL_TYPE, destroyer.getType());
        // set type tu new type and verify if destroyer gets the new type
        destroyer.setType(NEW_TYPE);
        assertEquals(NEW_TYPE, destroyer.getType());
    }

    @Test
    public void testSetAndGetLength() {
        // valid integer
        final int ORIGINAL_LENGTH = 5;
        // valid integer
        final int NEW_LENGTH = 7;
        // test passing negative number
        final int NEGATIVE_LENGTH = -7;
        // create a new destroyer
        Destroyer destroyer = new Destroyer("Test destroyer", ORIGINAL_LENGTH, "Test Length", 0);
        // test that destroyer has the length passed in the constructor
        assertEquals(ORIGINAL_LENGTH, destroyer.getLength());
        // test that length dont change if user pass a negative number
        destroyer.setLength(NEGATIVE_LENGTH);
        assertEquals(ORIGINAL_LENGTH, destroyer.getLength());
        // test that length updates when calling set length
        destroyer.setLength(NEW_LENGTH);
        assertEquals(NEW_LENGTH, destroyer.getLength());
    }

    @Test
    public void testSetAndGetSpeed() {
        // create a new destroyer
        Destroyer destroyer = new Destroyer("Test destroyer", 10, "Test Speed", 0);
        // test passing invalid string
        final String STRING_NON_NUMERIC = "No numeric value";
        // test passing int range value
        final String STRING_BIG_NUMBER = "999999999999999999999";
        // test passing negative number as a string
        final String STRING_NEGATIVE_NUMBER = "-9999";
        // test passing valid number as a string
        final String STRING_VALID_NUMBER = "99";
        // valid integer
        final int INT_VALID_NUMBER = 99;
        // default output
        final int DEFAULT = 0;
        // test passing negative number as a string
        final int INT_NEGATIVE_NUMBER = -666;

        destroyer.setSpeed(STRING_NON_NUMERIC);
        assertEquals(DEFAULT, destroyer.getSpeed());

        destroyer.setSpeed(STRING_BIG_NUMBER);
        assertEquals(DEFAULT, destroyer.getSpeed());

        destroyer.setSpeed(STRING_NEGATIVE_NUMBER);
        assertEquals(DEFAULT, destroyer.getSpeed());

        destroyer.setSpeed(STRING_VALID_NUMBER);
        assertEquals(INT_VALID_NUMBER, destroyer.getSpeed());

        destroyer.setSpeed(INT_VALID_NUMBER);
        assertEquals(INT_VALID_NUMBER, destroyer.getSpeed());

        destroyer.setSpeed(INT_NEGATIVE_NUMBER);
        assertEquals(DEFAULT, destroyer.getSpeed());
    }

    @Test
    public void testSetAndGetMissiles() {
        // create a new destroyer
        Destroyer destroyer = new Destroyer("Test destroyer", 10, "Test Missiles", 0);
        // test passing invalid string
        final String STRING_NON_NUMERIC = "Hello destroyer";
        // test passing string out of range
        final String STRING_BIG_NUMBER = "999999999999999999999";
        // test passing negative number as a string
        final String STRING_NEGATIVE_NUMBER = "-9999";
        // test passing valid number as a string
        final String STRING_VALID_NUMBER = "69";
        // default output
        final int DEFAULT = 2;
        // expected output
        final int EXPECTED = 69;
        // test passing negative number as a string
        final int INT_NEGATIVE_NUMBER = -9999;

        destroyer.setMissiles(STRING_NON_NUMERIC);
        assertEquals(destroyer.getMissiles(), DEFAULT);

        destroyer.setMissiles(STRING_BIG_NUMBER);
        assertEquals(destroyer.getMissiles(), DEFAULT);

        destroyer.setMissiles(STRING_NEGATIVE_NUMBER);
        assertEquals(destroyer.getMissiles(), DEFAULT);

        destroyer.setMissiles(STRING_VALID_NUMBER);
        assertEquals(destroyer.getMissiles(), EXPECTED);

        destroyer.setMissiles(EXPECTED);
        assertEquals(destroyer.getMissiles(), EXPECTED);

        destroyer.setMissiles(INT_NEGATIVE_NUMBER);
        assertEquals(destroyer.getMissiles(), DEFAULT);

        destroyer.setMissiles(EXPECTED);
        assertEquals(destroyer.getMissiles(), EXPECTED);
    }
}
