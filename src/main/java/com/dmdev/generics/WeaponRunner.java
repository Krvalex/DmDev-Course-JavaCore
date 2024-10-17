package com.dmdev.generics;

import com.dmdev.generics.weapon.Bow;
import com.dmdev.generics.weapon.Sword;
import com.dmdev.generics.weapon.Weapon;
import com.dmdev.oop.practice2.Archer;
import com.dmdev.oop.practice2.Hero;
import com.dmdev.oop.practice2.Warrior;

public class WeaponRunner {

    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Леголас", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Боромир", 10);
        warrior.setWeapon(new Sword());

        printWeaponDamage(warrior);
    }

    public static void printWeaponDamage(Hero<? extends Weapon> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }
}
