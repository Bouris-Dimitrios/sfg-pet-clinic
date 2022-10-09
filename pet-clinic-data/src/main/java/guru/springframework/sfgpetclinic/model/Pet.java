package guru.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jt on 7/13/18.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pets")
public class Pet extends NamedEntity{


    @ManyToOne
    @JoinColumn(name="pet_type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name ="owner_id")
    private Owner owner;

    @Column(name ="birth_date")
    private LocalDate birthDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy ="pet")
    private Set<Visit> visits = new HashSet<>();


}
