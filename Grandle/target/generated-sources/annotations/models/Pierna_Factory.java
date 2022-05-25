package models;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class Pierna_Factory implements Factory<Pierna> {
  @Override
  public Pierna get() {
    return newInstance();
  }

  public static Pierna_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Pierna newInstance() {
    return new Pierna();
  }

  private static final class InstanceHolder {
    private static final Pierna_Factory INSTANCE = new Pierna_Factory();
  }
}
