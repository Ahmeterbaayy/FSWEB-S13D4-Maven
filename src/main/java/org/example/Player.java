package org.example;

public class Player {
    private String name;
    private int health;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.healthPercentage = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        this.healthPercentage = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // Sağlık yüzdesini döndürür
    public int healthRemaining() {
        return health;
    }

    public void loseHealth(int amount) {
        health -= amount;
        healthPercentage = health;
        if (health < 0) health = 0;
        if (healthPercentage < 0) healthPercentage = 0;
    }

    public void restoreHealth(int amount) {
        health += amount;
        healthPercentage = health;
        if (health > 100) health = 100;
        if (healthPercentage > 100) healthPercentage = 100;
    }
}
