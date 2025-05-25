package eci.edu.cvds.salud.service;

import eci.edu.cvds.salud.model.SpecialityModel;
import eci.edu.cvds.salud.repository.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class SpecialityService {
    @Autowired
    private SpecialityRepository specialityRepository;

    public Optional<SpecialityModel> getSpecialityById(String id){
        return specialityRepository.findById(id);
    }

    public SpecialityModel createSpeciality(SpecialityModel specialityModel){
        return specialityRepository.save(specialityModel);
    }
}
