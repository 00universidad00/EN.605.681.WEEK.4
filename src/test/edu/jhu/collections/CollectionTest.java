package edu.jhu.collections;

import main.edu.jhu.Contact;
import main.edu.jhu.aircrafts.P3;
import main.edu.jhu.ships.Destroyer;
import main.edu.jhu.ships.Ship;
import main.edu.jhu.ships.Submarine;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;

public class CollectionTest {
    @Test
    public void testCollectionOfSubmarines(){
        // create new array to store subs
        ArrayList<Submarine> submarines = new ArrayList<>();
        // create new subs and add them to the list
        submarines.add(new Submarine("Sub 1", 10, null, 2));
        submarines.add(new Submarine("Sub 2", 10, "Type 2", 2));
        submarines.add(new Submarine("Sub 3", 10, "Type 3", 2));
        // check that list is not empty
        assertFalse(submarines.isEmpty());
        // print list
        submarines.forEach(System.out::println);
    }

    @Test
    public void testCollectionOfDestroyers(){
        // create new array to store destroyers
        ArrayList<Destroyer> destroyers = new ArrayList<>();
        // create new destroyers and add them to the list
        destroyers.add(new Destroyer("Destroyer 1", 10, null, 2));
        destroyers.add(new Destroyer("Destroyer 2", 10, "Type 2", 2));
        destroyers.add(new Destroyer("Destroyer 3", 10, "Type 3", 2));
        // check that list is not empty
        assertFalse(destroyers.isEmpty());
        // print list
        destroyers.forEach(System.out::println);
    }

    @Test
    public void testCollectionOfShips(){
        // create new array to store ships
        ArrayList<Ship> ships = new ArrayList<>();
        // create new ships and add them to the list
        ships.add(new Destroyer("Destroyer 1", 10, null, 2));
        ships.add(new Destroyer("Destroyer 2", 10, "Type 2", 2));
        ships.add(new Destroyer("Destroyer 3", 10, "Type 3", 2));
        ships.add(new Submarine("Sub 1", 10, null, 2));
        ships.add(new Submarine("Sub 2", 10, "Type 2", 2));
        ships.add(new Submarine("Sub 3", 10, "Type 3", 2));
        // check that list is not empty
        assertFalse(ships.isEmpty());
        // print list
        ships.forEach(System.out::println);
    }

    @Test
    public void testCollectionOfContacts(){
        // create new array to store contacts
        ArrayList<Contact> contacts = new ArrayList<>();
        // create new ships and add them to the list
        contacts.add(new Destroyer("Destroyer 1", 10, null, 2));
        contacts.add(new Destroyer("Destroyer 2", 10, "Type 2", 2));
        contacts.add(new Destroyer("Destroyer 3", 10, "Type 3", 2));
        contacts.add(new Submarine("Sub 1", 10, null, 2));
        contacts.add(new Submarine("Sub 2", 10, "Type 2", 2));
        contacts.add(new Submarine("Sub 3", 10, "Type 3", 2));
        contacts.add(new P3("P3 1", 10, null, 2));
        contacts.add(new P3("P3 2", 10, "Type 2", 2));
        contacts.add(new P3("P3 3", 10, "Type 3", 2));
        // check that list is not empty
        assertFalse(contacts.isEmpty());
        // print list
        contacts.forEach(System.out::println);
    }
}
