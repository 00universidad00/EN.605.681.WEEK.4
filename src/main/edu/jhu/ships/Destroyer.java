package main.edu.jhu.ships;

import main.edu.jhu.Contact;

public class Destroyer extends Ship {
    // class members
    private int missiles;
    private final int DEFAULT_MISSILE_NUMBER = 2;

    /**
     * Public constructor used to create a new destroyer
     * @param name name of the destroyer
     * @param length length of the destroyer
     * @param type type of the destroyer
     * @param missiles missiles loaded to the destroyer
     */
    public Destroyer(String name, int length, String type, int missiles) {
        super(
                // if name is null use default name
                Contact.ifNullStringUseDefault(name, "Generic Destroyer"),
                length,
                // if type is null use default type
                Contact.ifNullStringUseDefault(type, "Generic Type")
        );
        this.setMissiles(Contact.isWholeNumber(missiles).orElse(DEFAULT_MISSILE_NUMBER));
    }

    /**
     * Method used to get the number of missiles in the destroyer
     * @return missiles as an integer
     */
    public int getMissiles() {
        return missiles;
    }

    /**
     * Method used to set the number of missiles in the destroyer
     * @param numberMissiles missiles number as a string
     */
    public void setMissiles(int numberMissiles) {
        // Validate integer using interface helper, if value is invalid set missiles to 2
        this.missiles = Contact.isWholeNumber(numberMissiles).orElse(DEFAULT_MISSILE_NUMBER);
    }

    /**
     * Method used to set the number of missiles in the destroyer
     * @param numberMissiles missiles number as a integer
     */
    public void setMissiles(String numberMissiles) {
        // Validate integer using interface helper, if value is invalid set missiles to 2
        this.missiles = Contact.isWholeNumber(numberMissiles).orElse(DEFAULT_MISSILE_NUMBER);
    }

    /**
     * Method used to get a readable representation of the destroyer object
     *
     * @return destroyer properties
     */
    @Override
    public String toString() {
        return String.format("Destroyer {Name: %s, Type: %s, Length: %d, Speed: %d, Missiles: %d}",
                getName(), getType(), getLength(), getSpeed(), getMissiles());
    }
}
