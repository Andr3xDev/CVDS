package eci.edu.cvds.salud.repository;

import eci.edu.cvds.salud.model.AppointmentModel;
import eci.edu.cvds.salud.model.SpecialityModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SpecialityRepository extends MongoRepository<SpecialityModel, String> {

}