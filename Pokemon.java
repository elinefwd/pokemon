public class Pokemon {
    private String type;
    private int level;

    public Pokemon(String type, int level) {
        this.type = type;
        this.level = level;
    }

    public void attack() {
        System.out.println("Pokemon attacks!");
    }

    public void defend() {
        System.out.println("Pokemon defends!");
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
