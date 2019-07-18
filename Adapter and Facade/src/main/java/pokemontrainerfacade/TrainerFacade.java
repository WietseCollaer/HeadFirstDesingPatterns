package pokemontrainerfacade;

import java.util.List;
import java.util.UUID;

public class TrainerFacade {
    private Trainer trainer;
    private PokemonRepository repository;

    public TrainerFacade(Trainer trainer) {
        this.trainer = trainer;
        this.repository = new PokemonRepository(trainer);
    }

    public UUID getId() {
        return trainer.getId();
    }

    public String getFullName() {
        return trainer.getFirstName() + " " + trainer.getLastName();
    }

    public List<Pokemon> getTeam() {
        return repository.findPokemonByTrainerId(trainer.getId());
    }
}
