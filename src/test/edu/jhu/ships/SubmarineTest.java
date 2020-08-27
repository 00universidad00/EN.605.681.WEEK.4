package edu.jhu.ships;

import main.edu.jhu.ships.Submarine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubmarineTest {

    @Test
    public void testNewSubmarine() {
        // create submarine 1
        Submarine submarine1 = new Submarine("Submarine 1", 10, "Generic", 4);
        // print submarine
        System.out.println(submarine1);
        // create submarine 2
        Submarine submarine2 = new Submarine("Submarine 2", 10, "Generic", 8);
        // print submarine
        System.out.println(submarine2);
    }

    @Test
    public void testSetAndGetName() {
        // Define valid name for the submarine
        final String ORIGINAL_NAME = "Original name";
        // Define valid name for the submarine
        final String NEW_NAME = "New name";
        // create a new submarine
        Submarine submarine = new Submarine(ORIGINAL_NAME, 10, "Test", 0);
        // validate that submarine has the original name
        assertEquals(ORIGINAL_NAME, submarine.getName());
        // set name tu null and verify if submarine keeps old name
        submarine.setName(null);
        // validate that submarine has the original name
        assertEquals(ORIGINAL_NAME, submarine.getName());
        // set name tu new name and verify if submarine gets the new name
        submarine.setName(NEW_NAME);
        assertEquals(NEW_NAME, submarine.getName());
    }

    @Test
    public void testSetAndGetType() {
        // Define valid name for the submarine
        final String ORIGINAL_TYPE = "Original Type";
        // Define valid name for the submarine
        final String NEW_TYPE = "New Submarine";
        // create a new submarine
        Submarine submarine = new Submarine("New Submarine", 10, ORIGINAL_TYPE, 0);
        // validate that submarine has the type passed by the constructor
        assertEquals(ORIGINAL_TYPE, submarine.getType());
        // set type tu null and verify if submarine keeps old name
        submarine.setType(null);
        // validate that submarine has the original type
        assertEquals(ORIGINAL_TYPE, submarine.getType());
        // set type tu new type and verify if submarine gets the new type
        submarine.setType(NEW_TYPE);
        assertEquals(NEW_TYPE, submarine.getType());
    }

    @Test
    public void testSetAndGetLength() {
        // valid integer
        final int ORIGINAL_LENGTH = 10;
        // valid integer
        final int NEW_LENGTH = 20;
        // test passing negative number
        final int NEGATIVE_LENGTH = -10;

        // create a new submarine
        Submarine submarine = new Submarine("Test Submarine", ORIGINAL_LENGTH, "Test Length", 0);
        // test that Submarine has the length passed in the constructor
        assertEquals(ORIGINAL_LENGTH, submarine.getLength());
        // test that length dont change if user pass a negative number
        submarine.setLength(NEGATIVE_LENGTH);
        assertEquals(ORIGINAL_LENGTH, submarine.getLength());
        // test that length updates when calling set length
        submarine.setLength(NEW_LENGTH);
        assertEquals(NEW_LENGTH, submarine.getLength());
    }

    @Test
    public void testSetAndGetSpeed() {
        // create a new submarine
        Submarine submarine = new Submarine("Test Submarine", 10, "TestSpeed", 0);

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

        submarine.setSpeed(STRING_NON_NUMERIC);
        assertEquals(DEFAULT, submarine.getSpeed());

        submarine.setSpeed(STRING_BIG_NUMBER);
        assertEquals(DEFAULT, submarine.getSpeed());

        submarine.setSpeed(STRING_NEGATIVE_NUMBER);
        assertEquals(DEFAULT, submarine.getSpeed());

        submarine.setSpeed(STRING_VALID_NUMBER);
        assertEquals(INT_VALID_NUMBER, submarine.getSpeed());

        submarine.setSpeed(INT_VALID_NUMBER);
        assertEquals(INT_VALID_NUMBER, submarine.getSpeed());

        submarine.setSpeed(INT_NEGATIVE_NUMBER);
        assertEquals(DEFAULT, submarine.getSpeed());
    }

    @Test
    public void testSetAndGetTorpedoes() {
        // create a new submarine
        Submarine submarine = new Submarine("Test Submarine", 10, "TestSpeed", 0);
        // test passing invalid string
        final String STRING_NON_NUMERIC = "Hello There";
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

        submarine.setTorpedoes(STRING_NON_NUMERIC);
        assertEquals(submarine.getTorpedoes(), DEFAULT);

        submarine.setTorpedoes(STRING_BIG_NUMBER);
        assertEquals(submarine.getTorpedoes(), DEFAULT);

        submarine.setTorpedoes(STRING_NEGATIVE_NUMBER);
        assertEquals(submarine.getTorpedoes(), DEFAULT);

        submarine.setTorpedoes(STRING_VALID_NUMBER);
        assertEquals(submarine.getTorpedoes(), EXPECTED);

        submarine.setTorpedoes(EXPECTED);
        assertEquals(submarine.getTorpedoes(), EXPECTED);

        submarine.setTorpedoes(INT_NEGATIVE_NUMBER);
        assertEquals(submarine.getTorpedoes(), DEFAULT);

        submarine.setTorpedoes(EXPECTED);
        assertEquals(submarine.getTorpedoes(), EXPECTED);
    }
}
