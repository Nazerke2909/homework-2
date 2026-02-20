package com.narxoz.rpg.loot;
import java.util.List;
public class ShadowLootTable implements LootTable {
    public List<String> getItems() { return List.of("Dark Relic", "Shadow Essence"); }
    public int getGoldDrop() { return 600; }
    public LootTable clone() { return new ShadowLootTable(); }
}