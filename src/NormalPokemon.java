import java.util.Arrays;
import java.util.List;

public class NormalPokemon extends Pokemon {

    int damage;
    List<String> attacks = Arrays.asList("tackle", "hyperbeam", "bodyslam", "headbutt");

    // ---------------------- Constructor ------------------
    public NormalPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    // ---------------------  Getters & Setters --------------
    public String getType() {
        return "normal";
    }

    List<String> getAttacks() {
        return attacks;
    }

    // ---------------------- Type Damage Calculator ---------------

    public int damageCalculator(Pokemon name, Pokemon enemy, int damage) {
        switch (enemy.getType()) {
            case "ghost" -> damage = 0;
            case "rock", "steel" -> damage /= 2;
            default -> {} //handles Water & Normal
            // handle other types not mentioned in the switch statement
        }
        return damage;
    }

    // --------------------- Attacks --------------------
    void tackle(Pokemon name, Pokemon enemy) {
        damage = 20;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Tackle, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
    void hyperBeam(Pokemon name, Pokemon enemy) {
        damage = 40;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Hyper Beam, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
    void bodySlam(Pokemon name, Pokemon enemy) {
        damage = 30;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Body Slam, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
    void headbutt(Pokemon name, Pokemon enemy) {
        damage = 25;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Headbutt, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
}

