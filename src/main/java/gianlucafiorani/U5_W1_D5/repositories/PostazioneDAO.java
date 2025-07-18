package gianlucafiorani.U5_W1_D5.repositories;

import gianlucafiorani.U5_W1_D5.entities.Postazione;
import gianlucafiorani.U5_W1_D5.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostazioneDAO extends JpaRepository<Postazione, UUID> {
    List<Postazione> findByTypeAndCity(Type type, String city);
}
