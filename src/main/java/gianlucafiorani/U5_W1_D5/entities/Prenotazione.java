package gianlucafiorani.U5_W1_D5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Prenotazione {
    private LocalDate date;
    @ManyToOne
    // @JoinColumn(name = "building_id")
    private Postazione postazione;
    @ManyToOne
    // @JoinColumn(name = "building_id")
    private User user;
}
