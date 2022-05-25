package Controlador;

import Repositoryos.RepositoryModul;
import dagger.Component;

import javax.inject.Inject;

@Component(modules = RepositoryModul.class)
public interface PersonasControladorComponent {

    PersonasControlador build();
}
