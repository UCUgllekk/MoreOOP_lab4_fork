package lotr;

import java.util.Random;

public class GameManager {
    private Random random = new Random();

    public void fight(Character c1, Character c2){
        for (int i = 3; i >= 1; i--){System.out.println(i);}
        System.out.println("Fight!!!");
        while (c1.isAlive() && c2.isAlive()) {
            int firstKick = random.nextInt(2);
            switch (firstKick) {
                case 0:
                    System.out.println(c1.toString() + "kicks" + c2.toString());
                    c1.kick(c2);
                case 1:
                    System.out.println(c2.toString() + "kicks" + c1.toString());
                    c2.kick(c1);
                default:
                    throw new IllegalArgumentException();
            }
        }
        if (!c1.isAlive()){
            System.out.println(c1.toString() + "died! (");
            System.out.println(c2.toString() + "WINS! (");
        }
        else {
            System.out.println(c2.toString() + "died! (");
            System.out.println(c1.toString() + "WINS! (");
        }
        System.out.println("The End!");
    }
}
