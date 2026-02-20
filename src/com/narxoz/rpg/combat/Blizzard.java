package com.narxoz.rpg.combat;
public class Blizzard implements Ability {
    public String getName() { return "Blizzard"; }
    public int getDamage() { return 100; }
    public String getDescription() { return "Heavy snow storm"; }
    public Ability clone() { return new Blizzard(); }
}