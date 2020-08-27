package main.edu.jhu.aircrafts;

import main.edu.jhu.Contact;

public class P3 extends Aircraft {
    // class members
    private int engines;

    /**
     * Public constructor used to build a new P3 object.
     * Validate that name and type are not null or replace nulls with default values
     *
     * @param name    name of the P3
     * @param length  length of th P3
     * @param type    type of the P3
     * @param engines engines of the P3
     */
    public P3(String name, int length, String type, int engines) {
        super(
                // if name is null use default name
                Contact.ifNullStringUseDefault(name, "Generic P3"),
                // if length is negative use default value
                Contact.isWholeNumber(length).orElse(DEFAULT_LENGTH),
                // if type is null use default type
                Contact.ifNullStringUseDefault(type, GENERIC_TYPE)
        );
        //, if value is invalid set engines to 2
        this.setEngines(Contact.isWholeNumber(engines).orElse(2));
    }

    /**
     * Method used to get the engines of a P3
     *
     * @return return number of engines as integer
     */
    public int getEngines() {
        return engines;
    }

    /**
     * Method used to set the number of engines. It validates that the number is not negative
     *
     * @param engines engines number as integer
     */
    public void setEngines(int engines) {
        // Validate integer using interface helper
        this.engines = Contact.isWholeNumber(engines).orElse(getEngines());
    }

    /**
     * Method used to get a readable representation of the P3 object
     *
     * @return p3 properties
     */
    @Override
    public String toString() {
        return String.format("P3 {Name: %s, Type: %s, Length: %d, Engines: %d, Speed: %d, Altitude: %d}",
                getName(), getType(), getLength(), getEngines(), getSpeed(), getAltitude());
    }
}
