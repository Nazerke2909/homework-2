package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;
import java.util.List;
public class NatureComponentFactory implements EnemyComponentFactory {
    public List<Ability> createAbilities() { return List.of(new VineWhip(), new NatureHeal()); }
    public LootTable createLootTable() { return new NatureLootTable(); }
    public String createAI() { return "Balanced Nature AI"; }
}