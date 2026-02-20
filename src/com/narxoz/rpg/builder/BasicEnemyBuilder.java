package com.narxoz.rpg.builder;
import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.List;
public class BasicEnemyBuilder implements EnemyBuilder {
    private Goblin gob = new Goblin();
    public EnemyBuilder setName(String n) { gob.name = n; return this; }
    public EnemyBuilder setHealth(int h) { gob.health = h; return this; }
    public EnemyBuilder setDamage(int d) { gob.damage = d; return this; }
    public EnemyBuilder setAbilities(List<Ability> a) { gob.abilities = a; return this; }
    public EnemyBuilder setLootTable(LootTable l) { gob.lootTable = l; return this; }
    public EnemyBuilder setAI(String ai) { gob.ai = ai; return this; }
    public Enemy build() { return gob; }
}