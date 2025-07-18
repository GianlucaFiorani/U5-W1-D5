package gianlucafiorani.U5_W1_D5.services;

import gianlucafiorani.U5_W1_D5.entities.Postazione;
import gianlucafiorani.U5_W1_D5.repositories.PostazioneDAO;
import org.springframework.beans.factory.annotation.Autowired;

public class PostazioneService {
    @Autowired
    PostazioneDAO postazioneDAO;

    public void save(Postazione postazione) {
        postazioneDAO.save(postazione);
    }

}
