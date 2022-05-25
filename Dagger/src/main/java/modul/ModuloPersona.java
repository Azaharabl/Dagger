package modul;

import dagger.Binds;
import dagger.Module;
import models.IPersona;
import models.Persona;

@Module
public interface ModuloPersona {
    @Binds
    IPersona provide(Persona p);
}
