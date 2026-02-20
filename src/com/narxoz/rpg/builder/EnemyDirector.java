package com.narxoz.rpg.builder;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.factory.EnemyComponentFactory;
public class EnemyDirector {
    public Enemy makeRaidBoss(EnemyBuilder b, EnemyComponentFactory f) {
        return b.setName("Epic Boss").setHealth(5000).setDamage(200)
                .setAbilities(f.createAbilities()).setLootTable(f.createLootTable()).setAI(f.createAI()).build();
    }
}