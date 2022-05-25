package Repositoryos;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import models.Persona;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PersonasRepository_Factory implements Factory<PersonasRepository> {
  private final Provider<Persona> pProvider;

  public PersonasRepository_Factory(Provider<Persona> pProvider) {
    this.pProvider = pProvider;
  }

  @Override
  public PersonasRepository get() {
    return newInstance(pProvider.get());
  }

  public static PersonasRepository_Factory create(Provider<Persona> pProvider) {
    return new PersonasRepository_Factory(pProvider);
  }

  public static PersonasRepository newInstance(Persona p) {
    return new PersonasRepository(p);
  }
}
