package com.narxoz.rpg.prototype;
import com.narxoz.rpg.enemy.Enemy;
import java.util.HashMap;
import java.util.Map;
public class EnemyRegistry {
    private Map<String, Enemy> templates = new HashMap<>();
    public void register(String key, Enemy e) { templates.put(key, e); }
    public Enemy get(String key) { return templates.get(key).clone(); }
}