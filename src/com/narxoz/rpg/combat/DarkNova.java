package com.narxoz.rpg.combat;
public class DarkNova implements Ability {
    public String getName() { return "Dark Nova"; }
    public int getDamage() { return 120; }
    public String getDescription() { return "Shadow explosion"; }
    public Ability clone() { return new DarkNova(); }
}