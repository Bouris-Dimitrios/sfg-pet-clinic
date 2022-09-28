package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.CrudService;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return null;
    }

    @Override
    public Pet findById(Long id) {
        return null;
    }
   @Override
    public Pet save(Pet object) {
        return null;
    }

    @Override
    public void delete(Pet object) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
