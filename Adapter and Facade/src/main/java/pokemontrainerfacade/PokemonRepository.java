package pokemontrainerfacade;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.google.common.collect.Lists.newArrayList;

public class PokemonRepository {
    private List<Pokemon> allPokemon;
    private Trainer trainer;

    public PokemonRepository() {
        initList();
    }

    public PokemonRepository(Trainer trainer) {
        this.trainer = trainer;
        initList();
        initTrainer();
    }

    public List<Pokemon> getAllPokemon() {
        return allPokemon;
    }

    public List<Pokemon> findPokemonByTrainerId(UUID trainerId) {
        return this.getAllPokemon().stream()
                .filter(pokemon -> trainerId.equals(pokemon.getTrainerId()))
                .collect(Collectors.toList());
    }

    private void initTrainer() {
        for (int i = 0; i < 6; i++) {
            allPokemon.get(i).setTrainerId(trainer.getId());
        }
    }

    private void initList() {
        this.allPokemon = newArrayList(
                new Pokemon("Pikachu"),
                new Pokemon("Charizard"),
                new Pokemon("Gengar"),
                new Pokemon("Arcanine"),
                new Pokemon("Bulbasaur"),
                new Pokemon("Blaziken"),
                new Pokemon("Umbreon"),
                new Pokemon("Lucario"),
                new Pokemon("Gardevoir"),
                new Pokemon("Eevee"),
                new Pokemon("Dragonite"),
                new Pokemon("Absol"),
                new Pokemon("Typhlosion"),
                new Pokemon("Ampharos"),
                new Pokemon("Squirtle"),
                new Pokemon("Flygon"),
                new Pokemon("Ninetales"),
                new Pokemon("Tyranitar"),
                new Pokemon("Infernape"),
                new Pokemon("Snorlax"),
                new Pokemon("Torterra")
        );
    }
}
