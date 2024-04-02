public class Main {
    public static void main(String[] args) {
        FirePokemon charmander = new FirePokemon("Fire", 5, 50);
        WaterPokemon squirtle = new WaterPokemon("Water", 5, 30);
        GrassPokemon bulbasaur = new GrassPokemon("Grass", 5, 40);
        ElectricPokemon pikachu = new ElectricPokemon("Electric", 5, 60);

        charmander.attack();
        squirtle.defend();
        bulbasaur.specialAbility();
        pikachu.attack();
    }
}
