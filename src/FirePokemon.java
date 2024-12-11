import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    int damage;
    List<String> attacks = Arrays.asList("firelash", "flamethrower", "pyroball", "inferno");

    // ---------------------- Constructor ------------------
    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    // ---------------------  Getters & Setters --------------
    public String getType() {
        return "fire";
    }
    List<String> getAttacks() {
        return attacks;
    }

    // ---------------------- Type Damage Calculator ---------------

    public int damageCalculator(Pokemon name, Pokemon enemy, int damage) {
        switch (enemy.getType()) {
            case "grass", "ice", "bug", "steel" -> damage *= 2;
            case "fire", "water", "dragon", "rock" -> damage /= 2;
            default -> {}
        }
        return damage;
    }

    // --------------------- Attacks --------------------
    void fireLash(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 20;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Fire Lash against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
    }
    void flameThrower(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 40;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Flamethrower against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
    }
    void pyroBall(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 30;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Pyro Ball against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
    }
    void inferno(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 25;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Inferno against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
    }
}
