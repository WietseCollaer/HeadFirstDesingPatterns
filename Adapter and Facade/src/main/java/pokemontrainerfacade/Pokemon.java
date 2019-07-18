package pokemontrainerfacade;

import java.util.UUID;

public class Pokemon {
    private UUID trainerId = null;
    private String name;
    /*private PokemonType primaryType;
    private PokemonType secondaryType;*/

    public Pokemon(String name) {
        this.name = name;
    }

    public UUID getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(UUID trainerId) {
        this.trainerId = trainerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
