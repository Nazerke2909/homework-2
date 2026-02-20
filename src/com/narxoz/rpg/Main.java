package com.narxoz.rpg;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.builder.*;
import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.prototype.*;

public class Main {
    public static void main(String[] args) {
        EnemyDirector dir = new EnemyDirector();
        EnemyRegistry reg = new EnemyRegistry();
        
        Enemy master = dir.makeRaidBoss(new BossEnemyBuilder(), new FireComponentFactory());
        reg.register("boss", master);
        
       Enemy clone = reg.get("boss");
        clone.name = "Cloned Boss";
        
        System.out.println("Original: " + master.name + " HP: " + master.health);
        System.out.println("Clone: " + clone.name + " HP: " + clone.health);
        
        clone.abilities.add(new com.narxoz.rpg.combat.VineWhip());
        System.out.println("Original abilities: " + master.abilities.size());
        System.out.println("Clone abilities: " + clone.abilities.size());
    }
}