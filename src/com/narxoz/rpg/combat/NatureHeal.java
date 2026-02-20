package com.narxoz.rpg.combat;
public class NatureHeal implements Ability {
    public String getName() { return "Nature Heal"; }
    public int getDamage() { return 0; }
    public String getDescription() { return "Restores HP"; }
    public Ability clone() { return new NatureHeal(); }
}