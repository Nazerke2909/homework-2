package com.narxoz.rpg.combat;
public class FireShield implements Ability {
    public String getName() { return "Fire Shield"; }
    public int getDamage() { return 0; }
    public String getDescription() { return "Burns attackers"; }
    public Ability clone() { return new FireShield(); }
}