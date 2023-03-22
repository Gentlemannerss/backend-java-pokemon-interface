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
    void fireLash(Pokemon name, Pokemon enemy) {
        damage = 20;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Fire Lash, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        /*
        This would only damage the pokemon that uses the move. (usefully for confusion)
        name.Hp -= damage;
        System.out.println("Your " + name.getName() + " is confused and now has " + name.getHp() + " HP.");
        */
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
    void flameThrower(Pokemon name, Pokemon enemy, PokemonTrainer trainer, PokemonGymOwner owner) {
        damage = 40;
        int totalDamage = damageCalculator(name, enemy, damage);
        enemy.Hp -= totalDamage;
        if (trainer.getName().equals(trainer.getName())) {
            System.out.println(trainer.getName() + "'s " + name.getName() + " uses Flamethrower against " + owner.getName() + "'s " + enemy.getName() + " and deals " + totalDamage + " damage." + " and now has " + enemy.getHp() + " HP.");
        } else if (owner.getName().equals(owner.getName())) {
            System.out.println(owner.getName() + "'s " + enemy.getName() + " uses Flamethrower against " + trainer.getName() + "'s " + name.getName() + " and deals " + totalDamage + " damage." + " and now has " + name.getHp() + " HP.");
        }
    }
    void pyroBall(Pokemon name, Pokemon enemy) {
        damage = 30;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Pyro Ball, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
    void inferno(Pokemon name, Pokemon enemy) {
        damage = 25;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Inferno, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
}
