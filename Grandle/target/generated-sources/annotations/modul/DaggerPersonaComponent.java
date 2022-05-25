package modul;

import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
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
public final class DaggerPersonaComponent implements PersonaComponent {
  private final DaggerPersonaComponent personaComponent = this;

  private DaggerPersonaComponent() {


  }

  public static Builder builder() {
    return new Builder();
  }

  public static PersonaComponent create() {
    return new Builder().build();
  }

  @Override
  public Persona build() {
    return Persona_Factory.newInstance(new Pierna());
  }

  public static final class Builder {
    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder moduloPierna(ModuloPierna moduloPierna) {
      Preconditions.checkNotNull(moduloPierna);
      return this;
    }

    public PersonaComponent build() {
      return new DaggerPersonaComponent();
    }
  }
}
