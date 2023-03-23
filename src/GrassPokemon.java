import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    int damage;
    List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leafblade");

    // ---------------------- Constructor ------------------
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    // ---------------------  Getters & Setters --------------
    public String getType() {
        return "grass";
    }
    List<String> getAttacks() {
        return attacks;
    }

    // ---------------------- Type Damage Calculator ---------------

    public int damageCalculator(Pokemon name, Pokemon enemy, int damage) {
        switch (enemy.getType()) {
            case "water", "ground", "rock" -> damage *= 2;
            case "fire", "grass", "poison", "flying", "bug", "dragon", "steel" -> damage /= 2;
            default -> {}
        }
        return damage;
    }

    // --------------------- Attacks --------------------
    public void leafStorm(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 30;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Leaf Storm against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
    }
    public void solarBeam(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 40;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Solar Beam against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
    }
    public void leechSeed(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 15;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Leech Seed, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        name.Hp += totalDamage;
        System.out.println(name.getName() + " now has " + name.getHp() + " HP.");
    }
    public void leafBlade(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 25;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Leaf Blade against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
    }
}
