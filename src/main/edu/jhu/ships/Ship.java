package main.edu.jhu.ships;

import main.edu.jhu.Contact;

public abstract class Ship implements Contact {
    // class members
    private String name;
    private String type;
    private int length;
    private int speed;


    /**
     * Public constructor. set default altitude and speed = 0
     *
     * @param name   name of the ship
     * @param length length of the ship
     * @param type   type of the ship
     */
    public Ship(String name, int length, String type) {
        this.setName(name);
        this.setType(type);
        this.setLength(length);
        // All ships start with speed = 0
        this.setSpeed(this.DEFAULT_SPEED);
    }

    /**
     * method used to get the name of the ship
     *
     * @return ship name as string
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * method used to set the name of the ship
     *
     * @param name name as string
     */
    @Override
    public void setName(String name) {
        // if name is null use previous name
        this.name = Contact.ifNullStringUseDefault(name, this.getName());
    }

    /**
     * method used to get the type of the ship
     *
     * @return the type of the ship as a string
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * method used to set the type of the ship
     *
     * @param type type as string
     */
    @Override
    public void setType(String type) {
        // if type is null use previous type
        this.type = Contact.ifNullStringUseDefault(type, this.getType());
    }

    /**
     * Method used to get the length of the ship
     *
     * @return length as integer
     */
    @Override
    public int getLength() {
        return this.length;
    }

    /**
     * Method used to set the length of the ship
     *
     * @param length length as integer
     */
    @Override
    public void setLength(int length) {
        // if length is not positive, use previous value
        this.length = Contact.isNatural(length).orElse(this.getLength());
    }

    /**
     * Method used to get the speed of the ship
     *
     * @return speed as integer
     */
    @Override
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Method used to set the speed of the ship
     *
     * @param speed speed as string
     */
    @Override
    public void setSpeed(String speed) {
        // if string invalid set speed to 0
        this.speed = Contact.isWholeNumber(speed).orElse(this.DEFAULT_SPEED);
    }

    /**
     * Method used to set the speed of the ship
     *
     * @param speed speed as integer
     */
    @Override
    public void setSpeed(int speed) {
        // convert int to string and call setter with string parameter
        setSpeed(String.valueOf(speed));
    }
}