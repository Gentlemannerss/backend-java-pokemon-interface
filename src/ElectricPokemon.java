import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    int damage;
    List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "volttackle");

    // ---------------------- Constructor ------------------
    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    // ---------------------  Getters & Setters --------------
    public String getType() {
        return "electric";
    }
    List<String> getAttacks() {
        return attacks;
    }

    // ---------------------- Type Damage Calculator ---------------

    public int damageCalculator(Pokemon name, Pokemon enemy, int damage) {
        switch (enemy.getType()) {
            case "water", "flying" -> damage *= 2;
            case "electric", "grass", "dragon" -> damage /= 2;
            case "ground" -> damage = 0;
            default -> {}
        }
        return damage;
    }

    // --------------------- Attacks --------------------
    void thunderPunch(Pokemon name, Pokemon enemy) {
        damage = 30;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Thunder Punch, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
    void electroBall(Pokemon name, Pokemon enemy) {
        damage = 25;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Electro Ball, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
    void thunder(Pokemon name, Pokemon enemy) {
        damage = 40;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Thunder, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        if (enemy.getType().equals("electric") || name.getType().equals("electric")) {
            if (enemy.getType().equals("electric")) {
                enemy.setHp(enemy.getHp() + 20);
                System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP thanks to the weather.");
            } else {
                name.setHp(name.getHp() + 20);
                System.out.println(name.getName() + " now has " + name.getHp() + " HP thanks to the weather.");
            }
        } else {
            System.out.println("The field turned Static.");
        }
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
    void voltTackle(Pokemon name, Pokemon enemy) {
        damage = 20;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Volt Tackle, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
}
