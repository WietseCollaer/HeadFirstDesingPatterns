package pokemontrainerfacade;

import java.util.UUID;

public class Trainer {
    private UUID id = UUID.randomUUID();
    private String firstName;
    private String lastName;

    public Trainer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
