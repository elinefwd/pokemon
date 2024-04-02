public class FirePokemon extends Pokemon {
    private int firePower;

    public FirePokemon(String type, int level, int firePower) {
        super(type, level);
        this.firePower = firePower;
    }

    public void specialAttack() {
        System.out.println("Fire Pokemon uses Fire Blast!");
    }

    @Override
    public void attack() {
        System.out.println("Fire Pokemon attacks with fire!");
    }

    public int getFirePower() {
        return firePower;
    }

    public void setFirePower(int firePower) {
        this.firePower = firePower;
    }
}
