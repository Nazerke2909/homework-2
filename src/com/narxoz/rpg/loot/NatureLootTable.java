package com.narxoz.rpg.loot;
import java.util.List;
public class NatureLootTable implements LootTable {
    public List<String> getItems() { return List.of("Magic Leaf", "Ancient Bark"); }
    public int getGoldDrop() { return 300; }
    public LootTable clone() { return new NatureLootTable(); }
}