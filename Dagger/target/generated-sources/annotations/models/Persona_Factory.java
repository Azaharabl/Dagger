package models;

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
public final class Persona_Factory implements Factory<Persona> {
  private final Provider<Pierna> piernaDProvider;

  public Persona_Factory(Provider<Pierna> piernaDProvider) {
    this.piernaDProvider = piernaDProvider;
  }

  @Override
  public Persona get() {
    return newInstance(piernaDProvider.get());
  }

  public static Persona_Factory create(Provider<Pierna> piernaDProvider) {
    return new Persona_Factory(piernaDProvider);
  }

  public static Persona newInstance(Pierna piernaD) {
    return new Persona(piernaD);
  }
}
