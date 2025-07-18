package gianlucafiorani.U5_W1_D5.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {
    private String username;
    private String name;
    private String surname;
    private String mail;
}
