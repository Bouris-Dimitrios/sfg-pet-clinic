package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Specialty;
import guru.springframework.sfgpetclinic.repositories.SpecialtyRepository;
import guru.springframework.sfgpetclinic.services.SpecialtyService;

import java.util.HashSet;
import java.util.Set;

public class SpecialtySDJpaService implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;


    public SpecialtySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findAll() {
        final Set<Specialty> result = new HashSet<>();
        specialtyRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Specialty findById(Long id) {
        return  specialtyRepository.findById(id).orElseThrow();
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
         specialtyRepository.deleteById(id);
    }
}
