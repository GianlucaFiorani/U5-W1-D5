package gianlucafiorani.U5_W1_D5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Prenotazione {
    @Id
    @GeneratedValue
    private UUID id;
    private LocalDate date;
    @ManyToOne
    private Postazione postazione;
    @ManyToOne
    private User user;
}
