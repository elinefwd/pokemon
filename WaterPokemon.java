public class WaterPokemon extends Pokemon {
    private int waterPower;

    public WaterPokemon(String type, int level, int waterPower) {
        super(type, level);
        this.waterPower = waterPower;
    }

    public void specialMove() {
        System.out.println("Water Pokemon uses Hydro Pump!");
    }

    @Override
    public void attack() {
        System.out.println("Water Pokemon attacks with water!");
    }

    public int getWaterPower() {
        return waterPower;
    }

    public void setWaterPower(int waterPower) {
        this.waterPower = waterPower;
    }
}
