package Repositoryos;

import dagger.internal.DaggerGenerated;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerRepositoryComponent implements RepositoryComponent {
  private final DaggerRepositoryComponent repositoryComponent = this;

  private DaggerRepositoryComponent() {


  }

  public static Builder builder() {
    return new Builder();
  }

  public static RepositoryComponent create() {
    return new Builder().build();
  }

  @Override
  public RepositoryComponent build() {
    return this;
  }

  public static final class Builder {
    private Builder() {
    }

    public RepositoryComponent build() {
      return new DaggerRepositoryComponent();
    }
  }
}
