import Controlador.DaggerPersonasControladorComponent;
import Controlador.PersonasControlador;
import Controlador.PersonasControladorComponent;
import dagger.internal.DaggerCollections;

import models.Persona;
import modul.DaggerPersonaComponent;
import modul.PersonaComponent;

public class main {



    public static void main(String[] args) {


        PersonasControladorComponent p = DaggerPersonasControladorComponent.create();
        PersonasControlador controlador = p.build();
        System.out.println(controlador);

    }
}
