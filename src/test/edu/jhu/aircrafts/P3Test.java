package edu.jhu.aircrafts;

import main.edu.jhu.aircrafts.P3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P3Test {
    @Test
    public void testNewDestroyer() {
        // create destroyer 1
        P3 p3 = new P3("P3 1", 10, "Generic", 4);
        // print destroyer
        System.out.println(p3);
        // create destroyer 1
        P3 p3b = new P3("P3 2", 10, "Generic", 4);
        // print destroyer
        System.out.println(p3b);
    }

    @Test
    public void testSetAndGetName() {
        // Define valid name for the p3
        final String ORIGINAL_NAME = "Original P3 name";
        // Define valid name for the p3
        final String NEW_NAME = "New P3 name";
        // create a new p3
        P3 p3 = new P3(ORIGINAL_NAME, 10, "Test", 0);
        // validate that p3 has the original name
        assertEquals(ORIGINAL_NAME, p3.getName());
        // set name tu null and verify if p3 keeps old name
        p3.setName(null);
        // validate that p3 has the original name
        assertEquals(ORIGINAL_NAME, p3.getName());
        // set name tu new name and verify if p3 gets the new name
        p3.setName(NEW_NAME);
        assertEquals(NEW_NAME, p3.getName());
    }

    @Test
    public void testSetAndGetType() {
        // Define valid name for the p3
        final String ORIGINAL_TYPE = "Original p3 Type";
        // Define valid name for the p3
        final String NEW_TYPE = "New p3 type";
        // create a new p3
        P3 p3 = new P3("New p3", 10, ORIGINAL_TYPE, 0);
        // validate that p3 has the type passed by the constructor
        assertEquals(ORIGINAL_TYPE, p3.getType());
        // set type tu null and verify if p3 keeps old name
        p3.setType(null);
        // validate that p3 has the original type
        assertEquals(ORIGINAL_TYPE, p3.getType());
        // set type tu new type and verify if p3 gets the new type
        p3.setType(NEW_TYPE);
        assertEquals(NEW_TYPE, p3.getType());
    }

    @Test
    public void testSetAndGetLength() {
        // valid integer
        final int ORIGINAL_LENGTH = 10;
        // valid integer
        final int NEW_LENGTH = 20;
        // test passing negative number
        final int NEGATIVE_LENGTH = -10;

        // create a new p3
        P3 p3 = new P3("Test p3", ORIGINAL_LENGTH, "Test Length", 0);
        // test that p3 has the length passed in the constructor
        assertEquals(ORIGINAL_LENGTH, p3.getLength());
        // test that length dont change if user pass a negative number
        p3.setLength(NEGATIVE_LENGTH);
        assertEquals(ORIGINAL_LENGTH, p3.getLength());
        // test that length updates when calling set length
        p3.setLength(NEW_LENGTH);
        assertEquals(NEW_LENGTH, p3.getLength());
    }

    @Test
    public void testSetAndGetSpeed() {
        // create a new p3
        P3 p3 = new P3("Test p3", 10, "TestSpeed", 0);

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

        p3.setSpeed(STRING_NON_NUMERIC);
        assertEquals(DEFAULT, p3.getSpeed());

        p3.setSpeed(STRING_BIG_NUMBER);
        assertEquals(DEFAULT, p3.getSpeed());

        p3.setSpeed(STRING_NEGATIVE_NUMBER);
        assertEquals(DEFAULT, p3.getSpeed());

        p3.setSpeed(STRING_VALID_NUMBER);
        assertEquals(INT_VALID_NUMBER, p3.getSpeed());

        p3.setSpeed(INT_VALID_NUMBER);
        assertEquals(INT_VALID_NUMBER, p3.getSpeed());

        p3.setSpeed(INT_NEGATIVE_NUMBER);
        assertEquals(DEFAULT, p3.getSpeed());
    }

    @Test
    public void testSetAndGetEngines() {
        // valid integer
        final int ORIGINAL_ENGINES = 2;
        // valid integer
        final int NEW_ENGINES = 4;
        // test passing negative number
        final int NEGATIVE_ENGINE = -10;

        // create a new p3
        P3 p3 = new P3("Test p3", 10, "Test Length", ORIGINAL_ENGINES);
        // test that p3 has the engines passed in the constructor
        assertEquals(ORIGINAL_ENGINES, p3.getEngines());
        // test that engines dont change if user pass a negative number
        p3.setEngines(NEGATIVE_ENGINE);
        assertEquals(ORIGINAL_ENGINES, p3.getEngines());
        // test that engines updates when calling set length
        p3.setEngines(NEW_ENGINES);
        assertEquals(NEW_ENGINES, p3.getEngines());
    }

    @Test
    public void testSetAndGetAltitude() {
        // valid integer
        final int DEFAULT_ALTITUDE = 0;
        // valid integer
        final int NEW_ALTITUDE = 4;
        // test passing negative number
        final int NEGATIVE_ALTITUDE = -10;

        // create a new p3
        P3 p3 = new P3("Test p3", 10, "Test Length", 2);
        // test that p3 has the default altitude passed in the constructor
        assertEquals(DEFAULT_ALTITUDE, p3.getAltitude());
        // test that altitude dont change if user pass a negative number
        p3.setAltitude(NEGATIVE_ALTITUDE);
        assertEquals(DEFAULT_ALTITUDE, p3.getAltitude());
        // test that altitude updates when calling set length
        p3.setAltitude(NEW_ALTITUDE);
        assertEquals(NEW_ALTITUDE, p3.getAltitude());
    }
}
