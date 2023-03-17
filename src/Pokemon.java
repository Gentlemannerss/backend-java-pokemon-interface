public abstract class Pokemon {
    private final String Name;
    private final int Level;
    int Hp;
    private final String Food;
    private final String Sound;


    public Pokemon(String name, int level, int hp, String food, String sound) {
        Name = name;
        Level = level;
        Hp = hp;
        Food = food;
        Sound = sound;
    }

    // ------------------ Getters ---------------
    public abstract String getType();
    public String getName() {
        return Name;
    }
    public int getLevel() {
        return Level;
    }
    public int getHp() {
        return Hp;
    }
    public void setHp(int hp) {
        Hp = hp;
    }
    public String getFood() {
        return Food;
    }
    public String getSound() {
        return Sound;
    }
}
