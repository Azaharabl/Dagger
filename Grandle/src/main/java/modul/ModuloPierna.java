package modul;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import jdk.jfr.Name;
import models.IPierna;
import models.Pierna;

@Module
public class ModuloPierna {

    //como mandar los componentes a el component

    @Provides
    @Name("pierna")
    IPierna providePierna(){return new Pierna();};
}
