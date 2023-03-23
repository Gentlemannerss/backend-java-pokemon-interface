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
    void thunderPunch(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 30;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Thunder Punch against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
    }
    void electroBall(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 25;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Electro Ball against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
    }
    void thunder(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 40;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Thunder against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
        if (enemy.getType().equals("electric") && name.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() + 20);
            name.setHp(name.getHp() + 20);
            System.out.println();
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() + 20);
            System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP thanks to the weather.");
        } else if (name.getType().equals("electric")) {
            name.setHp(name.getHp() + 20);
            System.out.println(name.getName() + " now has " + name.getHp() + " HP thanks to the weather.");
        } else {
            System.out.println("The field turned Static.");
        }
    }
    void voltTackle(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 20;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Volt Tackle against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
    }
}
