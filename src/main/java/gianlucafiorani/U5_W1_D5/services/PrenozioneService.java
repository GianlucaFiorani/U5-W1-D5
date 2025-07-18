package gianlucafiorani.U5_W1_D5.services;

import gianlucafiorani.U5_W1_D5.entities.Prenotazione;
import gianlucafiorani.U5_W1_D5.exceptions.ExistingReservation;
import gianlucafiorani.U5_W1_D5.exceptions.NotFoundException;
import gianlucafiorani.U5_W1_D5.repositories.PrenotazioneDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class PrenozioneService {
    @Autowired
    PrenotazioneDAO prenotazioneDAO;

    public Prenotazione findById(String id) {
        return prenotazioneDAO.findById(UUID.fromString(id)).orElseThrow(() -> new NotFoundException(id));
    }

    public void save(Prenotazione prenotazione) {
        try {
            if (prenotazioneDAO.isBooked(prenotazione.getPostazione().getId(), prenotazione.getUser().getId(), prenotazione.getDate()).isEmpty()) {
                prenotazioneDAO.save(prenotazione);
            } else {
                throw new ExistingReservation();
            }
        } catch (NotFoundException e) {
            prenotazioneDAO.save(prenotazione);
        }
    }

}
