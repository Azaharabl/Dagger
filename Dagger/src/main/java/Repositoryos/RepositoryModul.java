package Repositoryos;

import dagger.Binds;
import dagger.Module;

@Module
public interface RepositoryModul {

    @Binds
    IRepository provide(PersonasRepository repository);
}
