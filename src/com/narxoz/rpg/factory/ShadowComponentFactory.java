package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;
import java.util.List;
public class ShadowComponentFactory implements EnemyComponentFactory {
    public List<Ability> createAbilities() { return List.of(new ShadowStrike(), new DarkNova()); }
    public LootTable createLootTable() { return new ShadowLootTable(); }
    public String createAI() { return "Tactical Shadow AI"; }
}