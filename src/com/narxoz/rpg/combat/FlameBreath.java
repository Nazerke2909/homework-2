package com.narxoz.rpg.combat;
public class FlameBreath implements Ability {
    public String getName() { return "Flame Breath"; }
    public int getDamage() { return 50; }
    public String getDescription() { return "Fire AoE damage"; }
    public Ability clone() { return new FlameBreath(); }
}