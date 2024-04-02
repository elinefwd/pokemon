public class ElectricPokemon extends Pokemon {
    private int electricPower;

    public ElectricPokemon(String type, int level, int electricPower) {
        super(type, level);
        this.electricPower = electricPower;
    }

    public void thunderShock() {
        System.out.println("Electric Pokemon uses Thunder Shock!");
    }

    @Override
    public void attack() {
        System.out.println("Electric Pokemon attacks with electricity!");
    }

    public int getElectricPower() {
        return electricPower;
    }

    public void setElectricPower(int electricPower) {
        this.electricPower = electricPower;
    }
}
