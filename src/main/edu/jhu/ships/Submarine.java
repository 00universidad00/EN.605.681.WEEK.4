package main.edu.jhu.ships;

import main.edu.jhu.Contact;

/**
 * @author Eleazar Miranda
 */

public class Submarine extends Ship {
    private final int DEFAULT_TORPEDOES_NUMBER = 2;
    // class attributes
    private int torpedoes;

    /**
     * Public constructor used to create a new submarine. It calls super constructor
     *
     * @param name   the name of the submarine
     * @param length the length of the submarine
     * @param type   the type of the submarine (arbitrary string label)
     */
    public Submarine(String name, int length, String type, int torpedoes) {
        super(
                // if name is null use default name
                Contact.ifNullStringUseDefault(name, "Generic Submarine"),
                length,
                // if type is null use default type
                Contact.ifNullStringUseDefault(type, "Generic Type")
        );
        this.setTorpedoes(Contact.isWholeNumber(torpedoes).orElse(DEFAULT_TORPEDOES_NUMBER));
    }

    /**
     * Method used to get the current number of torpedoes loaded in the submarine
     *
     * @return number of torpedoes
     */
    public int getTorpedoes() {
        return torpedoes;
    }

    /**
     * Method used to load torpedoes to submarine. If number is invalid the submarine will be loaded with 2
     *
     * @param numberTorpedoes number of torpedoes to be loaded in the submarine
     */
    public void setTorpedoes(int numberTorpedoes) {
        // Validate integer using interface helper, if value is invalid set torpedoes to 2
        this.torpedoes = Contact.isWholeNumber(numberTorpedoes).orElse(DEFAULT_TORPEDOES_NUMBER);
    }

    /**
     * Method used to load torpedoes to submarine. If number is invalid the submarine will be loaded with 2
     *
     * @param numberTorpedoes number of torpedoes to be loaded in the submarine
     */
    public void setTorpedoes(String numberTorpedoes) {
        // convert string to integer using interface helper, If value is invalid set torpedoes to 2
        this.torpedoes = Contact.isWholeNumber(numberTorpedoes).orElse(DEFAULT_TORPEDOES_NUMBER);
    }

    /**
     * Method used to get a readable representation of the destroyer object
     *
     * @return sub properties
     */
    @Override
    public String toString() {
        return String.format("Submarine {Name: %s, Type: %s, Length: %d, Speed: %d, Torpedoes: %d}",
                getName(), getType(), getLength(), getSpeed(), getTorpedoes());
    }
}
