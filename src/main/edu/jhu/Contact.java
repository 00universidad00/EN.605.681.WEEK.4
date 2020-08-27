package main.edu.jhu;

import java.util.Optional;
import java.util.regex.Pattern;

/**
 * @author Eleazar Miranda
 */

public interface Contact {

    // helps set the default speed
    int DEFAULT_SPEED = 0;
    // helps set the default length
    int DEFAULT_LENGTH = 1;
    // helps set generic type
    String GENERIC_TYPE = "Generic Type";

    /**
     * Method used to test if string is a whole number
     *
     * @param number string input
     * @return valid integer or null if string is invalid integer
     */
    static Optional<Integer> isWholeNumber(String number) {
        final String WHOLE_REGEX = "^[0-9]\\d*$";
        // save string in optional
        Optional<String> input = Optional.of(String.valueOf(number));
        // validate and return integer value of string
        return input.map(result -> stringToInteger(WHOLE_REGEX, result));
    }

    /**
     * Method used to test if string is a whole number
     *
     * @param number integer input
     * @return valid integer or null if string is invalid integer
     */
    static Optional<Integer> isWholeNumber(int number) {
        return isWholeNumber(String.valueOf(number));
    }

    /**
     * Method used to test if string is a natural number
     *
     * @param number string input
     * @return valid integer or null if string is invalid natural
     */
    static Optional<Integer> isNatural(String number) {
        final String NATURAL_REGEX = "^[1-9]\\d*$";
        // save string in optional
        Optional<String> input = Optional.of(String.valueOf(number));
        // validate and return integer value of string
        return input.map(result -> stringToInteger(NATURAL_REGEX, result));
    }

    /**
     * Method used to test if string is a natural number
     *
     * @param number integer input
     * @return valid integer or null if string is invalid natural
     */
    static Optional<Integer> isNatural(int number) {
        return isNatural(String.valueOf(number));
    }

    /**
     * Method used to change string to integer
     *
     * @param regex regular expression used to validate if string is a integer
     * @param input string to be validated
     * @return integer value of string or null if input is invalid
     */
    static Integer stringToInteger(String regex, String input) {
        // returns true or false based on the validity of the input
        try {
            if (Pattern.matches(regex, input)) {
                // convert string to integer or return null if string is invalid
                return Integer.parseInt(input);
            } else {
                // not an integer!
                return null;
            }
        } catch (NumberFormatException e) {
            // not an integer!
            e.printStackTrace();
            System.out.println("String is not a valid integer! Check your code.");
            return null;
        }
    }

    /**
     * Method used to handle null strings.
     *
     * @param string       string to be validated
     * @param defaultValue value that will replace null
     * @return string or default value
     */
    static String ifNullStringUseDefault(String string, String defaultValue) {
        return Optional.ofNullable(string).or(() -> {
//            new NullPointerException().printStackTrace();
            System.out.println("Null value detected! Verify your code.");
            System.out.println("Replacing null with: " + defaultValue);
            return Optional.empty();
        }).orElse(defaultValue);
    }

    int getLength();

    void setLength(int length);

    int getSpeed();

    void setSpeed(String speed);

    void setSpeed(int speed);

    String getName();

    void setName(String name);

    String getType();

    void setType(String type);
}