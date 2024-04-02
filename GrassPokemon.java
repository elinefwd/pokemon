public class GrassPokemon extends Pokemon {
    private int grassPower;

    public GrassPokemon(String type, int level, int grassPower) {
        super(type, level);
        this.grassPower = grassPower;
    }

    public void specialAbility() {
        System.out.println("Grass Pokemon uses Solar Beam!");
    }



    @Override
    public void attack() {
        System.out.println("Grass Pokemon attacks with grass!");
    }

    public int getGrassPower() {
        return grassPower;
    }

    public void setGrassPower(int grassPower) {
        this.grassPower = grassPower;
    }
}
