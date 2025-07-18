package gianlucafiorani.U5_W1_D5.repositories;

import gianlucafiorani.U5_W1_D5.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface PrenotazioneDAO extends JpaRepository<Prenotazione, UUID> {

    @Query("SELECT p FROM Prenotazione p WHERE p.date = :date")
    List<Prenotazione> findByDate(LocalDate date);

    @Query("SELECT p FROM Prenotazione p WHERE p.building = :building AND p.user = :user AND p.date = :date")
    List<Prenotazione> isBooked(UUID building, UUID user, LocalDate date);
}
