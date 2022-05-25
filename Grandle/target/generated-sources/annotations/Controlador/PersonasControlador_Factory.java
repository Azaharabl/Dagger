package Controlador;

import Repositoryos.IRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class PersonasControlador_Factory implements Factory<PersonasControlador> {
  private final Provider<IRepository> repositoryProvider;

  public PersonasControlador_Factory(Provider<IRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public PersonasControlador get() {
    return newInstance(repositoryProvider.get());
  }

  public static PersonasControlador_Factory create(Provider<IRepository> repositoryProvider) {
    return new PersonasControlador_Factory(repositoryProvider);
  }

  public static PersonasControlador newInstance(IRepository repository) {
    return new PersonasControlador(repository);
  }
}
