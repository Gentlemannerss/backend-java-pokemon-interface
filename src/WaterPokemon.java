import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    int damage;
    List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");

    // ---------------------- Constructor ------------------
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    // ---------------------  Getters & Setters --------------
    public String getType() {
        return "water";
    }

    List<String> getAttacks() {
        return attacks;
    }

    // ---------------------- Type Damage Calculator ---------------

    public int damageCalculator(Pokemon name, Pokemon enemy, int damage) {
        switch (enemy.getType()) {
            case "fire", "ground", "rock" -> damage *= 2;
            case "grass", "water", "dragon" -> damage /= 2;
            default -> {} //handles Water & Normal
            // handle other types not mentioned in the switch statement
        }
        return damage;
    }

    // --------------------- Attacks --------------------

    void surf(Pokemon name, Pokemon enemy) {
        damage = 30;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Surf, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        damage = 25;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Hydro Pump, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        damage = 40;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Hydro Cannon, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        damage = 5;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Rain Dance.");
        if (enemy.getType().equals("electric")) {
            System.out.println("This has no effect on the " + enemy.getName());
        } else if (enemy.getType().equals("grass")) {
            enemy.Hp += totalDamage;
            System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP thanks to Rain Dance.");
        } else {
            enemy.Hp -= totalDamage;
            System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        }
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
}
