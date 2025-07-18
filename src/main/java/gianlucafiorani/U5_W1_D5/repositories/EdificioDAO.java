package gianlucafiorani.U5_W1_D5.repositories;

import gianlucafiorani.U5_W1_D5.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EdificioDAO extends JpaRepository<Edificio, UUID> {
}
