package gianlucafiorani.U5_W1_D5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Edificio {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String address;
    private String city;
}
