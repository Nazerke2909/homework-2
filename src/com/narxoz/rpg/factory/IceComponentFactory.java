package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;
import java.util.List;
public class IceComponentFactory implements EnemyComponentFactory {
    public List<Ability> createAbilities() { return List.of(new FrostBreath(), new Blizzard()); }
    public LootTable createLootTable() { return new IceLootTable(); }
    public String createAI() { return "Defensive Ice AI"; }
}