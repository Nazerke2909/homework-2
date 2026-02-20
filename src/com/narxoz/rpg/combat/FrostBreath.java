package com.narxoz.rpg.combat;
public class FrostBreath implements Ability {
    public String getName() { return "Frost Breath"; }
    public int getDamage() { return 40; }
    public String getDescription() { return "Freezes enemies"; }
    public Ability clone() { return new FrostBreath(); }
}