package modul;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import models.IPierna;

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
public final class ModuloPierna_ProvidePiernaFactory implements Factory<IPierna> {
  private final ModuloPierna module;

  public ModuloPierna_ProvidePiernaFactory(ModuloPierna module) {
    this.module = module;
  }

  @Override
  public IPierna get() {
    return providePierna(module);
  }

  public static ModuloPierna_ProvidePiernaFactory create(ModuloPierna module) {
    return new ModuloPierna_ProvidePiernaFactory(module);
  }

  public static IPierna providePierna(ModuloPierna instance) {
    return Preconditions.checkNotNullFromProvides(instance.providePierna());
  }
}
