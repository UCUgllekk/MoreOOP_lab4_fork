package lotr;

import java.util.Random;

public class CharacterFactory {
    private Random random = new Random();
    public Character creatCharacter(){
        int randomCharacter = random.nextInt(4);
        switch (randomCharacter) {
            case 0:
                return new Elf();
            case 1:
                return new Hobbit();
            case 2:
                return new King();
            case 3:
                return new Knight();
            default:
                throw new IllegalArgumentException();
        }
    }
}
