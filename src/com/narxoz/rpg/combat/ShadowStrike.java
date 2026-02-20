package com.narxoz.rpg.combat;
public class ShadowStrike implements Ability {
    public String getName() { return "Shadow Strike"; }
    public int getDamage() { return 70; }
    public String getDescription() { return "Critical backstab"; }
    public Ability clone() { return new ShadowStrike(); }
}