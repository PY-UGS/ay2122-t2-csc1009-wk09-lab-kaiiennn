package week9lab;

import java.util.ArrayList;
import java.util.Random;

public class RandomCharacter {
    private char lowercaseCharacter;
    private char upperCaseCharacter;
    private int randomNum;
    Random random = new Random();

    public String getRandomLowerCaseLetter(){
        lowercaseCharacter = (char)('a' + random.nextInt(0,26)); //ASCII of a + 26 will be z
        //Generate a random integer between 1 and 26
        return Character.toString(lowercaseCharacter);
    }

    public String getRandomUpperCaseLetter(){
        upperCaseCharacter = (char)('A' + random.nextInt(0,26)); //ASCII of A + 26 will be Z
        return Character.toString(upperCaseCharacter);
    }

    public String getRandomDigitCharacter(){
        randomNum = random.nextInt(0,10); //Get a random integer between 0 to 10.
        return Integer.toString(randomNum);
    }

    public String getRandomCharacter(){
        int randomOption = random.nextInt(0, 3);
        switch (randomOption) {
            case 0:
                return getRandomLowerCaseLetter();

            case 1:
                return getRandomUpperCaseLetter();

            case 2:
                return getRandomDigitCharacter();

            default:
                return getRandomLowerCaseLetter();
        }
    }

}
