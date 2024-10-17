package com.dmdev.oop.practice2;

import com.dmdev.generics.weapon.MageWeapon;

public class Mage<T extends MageWeapon> extends Hero<T> {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " сотворил заклинание в " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
