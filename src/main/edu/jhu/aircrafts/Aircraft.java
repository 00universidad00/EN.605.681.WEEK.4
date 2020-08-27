package main.edu.jhu.aircrafts;

import main.edu.jhu.Contact;

/**
 * @author Eleazar Miranda
 */

abstract class Aircraft implements Contact {
    // class members
    private String name;
    private String type;
    private int length;
    private int speed;
    private int altitude;

    /**
     * Public constructor. set default altitude and speed = 0
     *
     * @param name   name of the aircraft
     * @param length length of the aircraft
     * @param type   type of the aircraft
     */
    public Aircraft(String name, int length, String type) {
        this.setName(name);
        this.setType(type);
        this.setLength(length);
        // All new aircraft start with altitude = 0
        this.setAltitude(0);
        // All new aircraft start with speed = 0
        this.setSpeed(this.DEFAULT_SPEED);
    }

    /**
     * method used to get the name of the aircraft
     *
     * @return aircraft name as string
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * method used to set the name of the aircraft
     *
     * @param name name as string
     */
    @Override
    public void setName(String name) {
        // if name is null use previous name
        this.name = Contact.ifNullStringUseDefault(name, this.getName());
    }

    /**
     * method used to get the type of the aircraft
     *
     * @return the type of the aircraft as a string
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * method used to set the type of the aircraft
     *
     * @param type type as string
     */
    @Override
    public void setType(String type) {
        // if type is null use previous type
        this.type = Contact.ifNullStringUseDefault(type, this.getType());
    }

    /**
     * Method used to get the length of the aircraft
     *
     * @return length as integer
     */
    @Override
    public int getLength() {
        return this.length;
    }

    /**
     * Method used to set the length of the aircraft
     *
     * @param length length as integer
     */
    @Override
    public void setLength(int length) {
        // if length is not positive, use previous value
        this.length = Contact.isNatural(length).orElse(this.getLength());
    }

    /**
     * Method used to get the speed of the aircraft
     *
     * @return speed as integer
     */
    @Override
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Method used to set the speed of the aircraft
     *
     * @param speed speed as string
     */
    @Override
    public void setSpeed(String speed) {
        // if string invalid set speed to 0
        this.speed = Contact.isWholeNumber(speed).orElse(this.DEFAULT_SPEED);
    }

    /**
     * Method used to set the speed of the aircraft
     *
     * @param speed speed as integer
     */
    @Override
    public void setSpeed(int speed) {
        // convert int to string and call setter with string parameter
        setSpeed(String.valueOf(speed));
    }

    /**
     * Method used to get the altitude of the aircraft
     *
     * @return altitude as integer
     */
    public int getAltitude() {
        return this.altitude;
    }

    /**
     * method used to set the altitude of the aircraft.
     * (Validates that value is integer granter than 0)
     *
     * @param altitude altitude as integer
     */
    public void setAltitude(int altitude) {
        // if length is not positive, use previous value
        this.altitude = Contact.isNatural(altitude).orElse(this.getAltitude());
    }
}
