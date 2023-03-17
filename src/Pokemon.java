public abstract class Pokemon {
    private String Name;
    private int Level;
    int Hp;
    private String Food;
    private String Sound;


    public Pokemon(String name, int level, int hp, String food, String sound) {
        Name = name;
        Level = level;
        Hp = hp;
        Food = food;
        Sound = sound;
    }

    public abstract String getType();

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
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

    public void setFood(String food) {
        Food = food;
    }

    public String getSound() {
        return Sound;
    }

    public void setSound(String sound) {
        Sound = sound;
    }
}
