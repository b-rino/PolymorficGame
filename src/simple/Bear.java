package simple;

import java.util.Random;

public class Bear implements Creature {
    private int health = 10;
    private String name;

    public Bear(String name) {
        this.name = "Bear";
    }

    public int attack(){
        Random r = new Random();
        return r.nextInt(10);
    }

    public String meet(){
        return "suddenly a big bear appears from the woods";
    }

    public void takeDamage(int damage){
        health -= damage;
    }

    public int getHealth(){
        return this.health;
    }
    public String getName(){
        return this.name;
    }
}
