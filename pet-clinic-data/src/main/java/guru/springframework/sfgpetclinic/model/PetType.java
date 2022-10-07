package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by jt on 7/13/18.
 */

@Entity
@Table(name="types")
public class PetType extends NamedEntity{
    public PetType() {
    }


}
