package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;
import java.util.List;
public class FireComponentFactory implements EnemyComponentFactory {
    public List<Ability> createAbilities() { return List.of(new FlameBreath(), new MeteorStorm()); }
    public LootTable createLootTable() { return new FireLootTable(); }
    public String createAI() { return "Aggressive Fire AI"; }
}