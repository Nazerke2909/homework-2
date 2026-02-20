package com.narxoz.rpg.combat;
public class Vanish implements Ability {
    public String getName() { return "Vanish"; }
    public int getDamage() { return 0; }
    public String getDescription() { return "Invisibility"; }
    public Ability clone() { return new Vanish(); }
}