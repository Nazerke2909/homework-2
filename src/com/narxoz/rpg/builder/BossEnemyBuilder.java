package com.narxoz.rpg.builder;
import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.List;
public class BossEnemyBuilder implements EnemyBuilder {
    private DragonBoss boss = new DragonBoss();
    public EnemyBuilder setName(String n) { boss.name = n; return this; }
    public EnemyBuilder setHealth(int h) { boss.health = h; return this; }
    public EnemyBuilder setDamage(int d) { boss.damage = d; return this; }
    public EnemyBuilder setAbilities(List<Ability> a) { boss.abilities = a; return this; }
    public EnemyBuilder setLootTable(LootTable l) { boss.lootTable = l; return this; }
    public EnemyBuilder setAI(String ai) { boss.ai = ai; return this; }
    
    //factory method: build 
    public Enemy build() {
        if (boss.name == null) throw new IllegalStateException("Boss needs name!");
        return boss;
    }
}