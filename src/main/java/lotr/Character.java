package lotr;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;

    public abstract void kick(Character c);
    public boolean isAlive(){
        if (this.hp > 0){
            return true;
        }
        else return false;
    }
    public void setHp(int hp){
        if (hp <= 0) {
            this.hp = 0;
        }
        else {
            this.hp = hp;
        }
    }
    public void setPower(int power){
        if (power <= 0){
            this.power = 0;
        }
        else {
            this.power = power;
        }
    }
}
