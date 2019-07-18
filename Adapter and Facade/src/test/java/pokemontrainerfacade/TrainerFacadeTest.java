package pokemontrainerfacade;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TrainerFacadeTest {
    @Test
    public void itWorks() {
        Trainer trainer = new Trainer("Pieter", "Vandebeste");
        TrainerFacade facade = new TrainerFacade(trainer);

        assertThat(facade.getId()).isEqualTo(trainer.getId());
        assertThat(facade.getFullName()).isEqualTo(trainer.getFirstName() + " " + trainer.getLastName());
        assertThat(facade.getTeam()).hasSize(6);
    }
}
