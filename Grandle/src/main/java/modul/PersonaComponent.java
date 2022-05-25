package modul;

import dagger.Component;
import models.Persona;
import models.Pierna;


//como componemos unaa persona

@Component(modules={ ModuloPierna.class})
public interface PersonaComponent {
    Persona build();
}
