package com.narxoz.rpg.loot;
import java.util.List;
public class IceLootTable implements LootTable {
    public List<String> getItems() { return List.of("Ice Crystal", "Frost Fang"); }
    public int getGoldDrop() { return 400; }
    public LootTable clone() { return new IceLootTable(); }
}