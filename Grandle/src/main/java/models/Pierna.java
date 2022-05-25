package models;

import javax.inject.Inject;
import java.util.UUID;

public class Pierna implements IPierna {
    private static final String s = UUID.randomUUID().toString();

    //inllect en todo s los constructiores, y en los que hay que inllectar se pone como si se metiera
    @Inject
    public Pierna() {
    }

    @Override
    public String toString() {
        return "Pierna{}";
    }
}
