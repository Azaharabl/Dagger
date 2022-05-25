package Controlador;

import Repositoryos.IRepository;
import Repositoryos.PersonasRepository;

import javax.inject.Inject;

public class PersonasControlador implements IPersonasControlador {
    IRepository repository ;

    @Inject
    public PersonasControlador(IRepository repository) {
        this.repository = repository;
    }

    @Override
    public String toString() {
        return "PersonasControlador{" +
                "repository=" + repository +
                '}';
    }
}
