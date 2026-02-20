package com.narxoz.rpg.builder;
import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.List;
public class UndeadEnemyBuilder implements EnemyBuilder {
    private Skeleton skel = new Skeleton();
    public EnemyBuilder setName(String n) { skel.name = n; return this; }
    public EnemyBuilder setHealth(int h) { skel.health = h; return this; }
    public EnemyBuilder setDamage(int d) { skel.damage = d; return this; }
    public EnemyBuilder setAbilities(List<Ability> a) { skel.abilities = a; return this; }
    public EnemyBuilder setLootTable(LootTable l) { skel.lootTable = l; return this; }
    public EnemyBuilder setAI(String ai) { skel.ai = ai; return this; }
    public Enemy build() { return skel; }
}