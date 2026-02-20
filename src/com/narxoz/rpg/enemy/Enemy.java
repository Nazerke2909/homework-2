package com.narxoz.rpg.enemy;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.List;
import java.util.ArrayList;

public abstract class Enemy {
    public String name;
    public int health;
    public int damage;
    public List<Ability> abilities = new ArrayList<>();
    public LootTable lootTable;
    public String ai;

    public abstract Enemy clone();
}