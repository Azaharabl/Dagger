package Controlador;

import Repositoryos.PersonasRepository;
import dagger.internal.DaggerGenerated;
import javax.annotation.processing.Generated;
import models.Persona;
import models.Persona_Factory;
import models.Pierna;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerPersonasControladorComponent implements PersonasControladorComponent {
  private final DaggerPersonasControladorComponent personasControladorComponent = this;

  private DaggerPersonasControladorComponent() {


  }

  public static Builder builder() {
    return new Builder();
  }

  public static PersonasControladorComponent create() {
    return new Builder().build();
  }

  private Persona persona() {
    return Persona_Factory.newInstance(new Pierna());
  }

  private PersonasRepository personasRepository() {
    return new PersonasRepository(persona());
  }

  @Override
  public PersonasControlador build() {
    return new PersonasControlador(personasRepository());
  }

  public static final class Builder {
    private Builder() {
    }

    public PersonasControladorComponent build() {
      return new DaggerPersonasControladorComponent();
    }
  }
}
