import java.util.Arrays;
import java.util.List;

public class NormalPokemon extends Pokemon {

    int damage;
    List<String> attacks = Arrays.asList("confusion", "hyperbeam", "bodyslam", "headbutt");

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
            default -> {}
        }
        return damage;
    }

    // --------------------- Attacks --------------------
    void confusion(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 20;
        boolean ifConfused = Math.random() < 0.1;
        if (ifConfused) {
            System.out.println(trainer.getName() + "'s "+ name.getName() + " is Confused and hits itself, and now has " + name.getHp() + " HP.");
            name.Hp -= damage;
        } else {
            int totalDamage = damageCalculator(name, enemy, damage);
            enemy.Hp -= totalDamage;
            System.out.println(trainer.getName() + "'s " + name.getName() + " uses Confusion against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
        }
    }
    void hyperBeam(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 40;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Hyper Beam against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
    }
    void bodySlam(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 30;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Body Slam against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
    }
    void headbutt(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonTrainer owner) {
        damage = 25;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        System.out.println(trainer.getName() + "'s " + name.getName() + " uses Headbutt against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
    }
}

