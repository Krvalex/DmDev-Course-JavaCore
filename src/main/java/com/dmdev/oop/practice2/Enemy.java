package com.dmdev.oop.practice2;

public class Enemy implements Mortal {

    private String name;
    private int health;

    public Enemy(int health, String name) {
        this.name = name;
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        if (isAlive() && this.health <= damage) {
            health = 0;
            System.out.println(getName() + " погиб");
        } else {
            this.health -= Math.min(health, damage);
            System.out.println(name + " получил урон " + damage + ". Остальось " + health);
        }
    }
}
