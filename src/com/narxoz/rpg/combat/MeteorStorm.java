package com.narxoz.rpg.combat;
public class MeteorStorm implements Ability {
    public String getName() { return "Meteor Storm"; }
    public int getDamage() { return 150; }
    public String getDescription() { return "Ultimate fire rain"; }
    public Ability clone() { return new MeteorStorm(); }
}