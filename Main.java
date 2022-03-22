package week9lab;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        RandomCharacter randomCharacter = new RandomCharacter();
        ArrayList<String> charArr = new ArrayList<>();
        String randomChar;
        for (int i = 0; i < 15; i++){
            randomChar = randomCharacter.getRandomCharacter();
            System.out.println(randomChar);
            charArr.add(randomChar);
        }

    }
}
