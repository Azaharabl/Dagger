package models;

import javax.inject.Inject;
import java.util.UUID;

public class Persona  implements IPersona{
    private final String s = UUID.randomUUID().toString();
    Pierna piernaD;


    //inllect en todo s los constructiores, y en los que hay que inllectar se pone como si se metiera

    @Inject
     Persona( Pierna piernaD) {

        this.piernaD = piernaD;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "s='" + s + '\'' +
                ", piernaD=" + piernaD +
                '}';
    }
}
