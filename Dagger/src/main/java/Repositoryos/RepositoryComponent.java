package Repositoryos;

import dagger.Component;
import models.IPersona;
import models.Persona;
import modul.ModuloPersona;
import modul.ModuloPierna;

@Component(modules = ModuloPersona.class)
public interface RepositoryComponent {

    RepositoryComponent build();
}
