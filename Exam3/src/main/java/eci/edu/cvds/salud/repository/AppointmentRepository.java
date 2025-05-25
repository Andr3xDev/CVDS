package eci.edu.cvds.salud.repository;

import eci.edu.cvds.salud.model.AppointmentModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AppointmentRepository extends MongoRepository<AppointmentModel, String> {

    AppointmentModel findByStatus(String status);
}
