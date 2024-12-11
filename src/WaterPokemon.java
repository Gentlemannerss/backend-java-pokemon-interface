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
            default -> {}
        }
        return damage;
    }

    // --------------------- Attacks --------------------

    void surf(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 30;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Surf against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
    }

    void hydroPump(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 25;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Hydro Pump against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
    }

    void hydroCanon(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 40;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Hydro Canon against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
    }

    void rainDance(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 5;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses rain dance against " + owner.getName() + "'s " + enemy.getName());
        if (enemy.getType().equals("electric")) {
            System.out.println("This has no effect on the " + enemy.getName());
        } else if (enemy.getType().equals("grass")) {
            enemy.Hp += damage;
            System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP thanks to Rain Dance.");
        } else {
            enemy.Hp -= totalDamage;
            System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        }
    }
}
