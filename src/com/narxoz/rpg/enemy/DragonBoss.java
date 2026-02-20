package com.narxoz.rpg.enemy;
import com.narxoz.rpg.combat.Ability;
import java.util.ArrayList;
public class DragonBoss extends Enemy {
    @Override
    public Enemy clone() {
        DragonBoss copy = new DragonBoss();
        copy.name = this.name;
        copy.health = this.health;
        copy.damage = this.damage;
        copy.ai = this.ai;
        copy.abilities = new ArrayList<>();
        for (Ability a : this.abilities) copy.abilities.add(a.clone());
        if (this.lootTable != null) copy.lootTable = this.lootTable.clone();
        return copy;
    }
}