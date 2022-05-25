package Repositoryos;

import models.Persona;

import javax.inject.Inject;
import java.util.*;

public class PersonasRepository implements IRepository{
    List<Persona> lista = new ArrayList<>();

    @Inject
    public PersonasRepository(Persona p) {
        lista.add(p);
    }

    @Override
    public String toString() {
        return "PersonasRepository{" +
                "lista=" + lista +
                '}';
    }
}
