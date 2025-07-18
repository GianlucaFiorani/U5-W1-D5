package gianlucafiorani.U5_W1_D5.services;

import gianlucafiorani.U5_W1_D5.entities.Edificio;
import gianlucafiorani.U5_W1_D5.repositories.EdificioDAO;
import org.springframework.beans.factory.annotation.Autowired;

public class EdificioService {
    @Autowired
    EdificioDAO edificioDAO;

    public void save(Edificio edificio) {
        edificioDAO.save(edificio);
    }

}
