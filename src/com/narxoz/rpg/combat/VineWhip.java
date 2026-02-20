package com.narxoz.rpg.combat;
public class VineWhip implements Ability {
    public String getName() { return "Vine Whip"; }
    public int getDamage() { return 30; }
    public String getDescription() { return "Nature lash"; }
    public Ability clone() { return new VineWhip(); }
}