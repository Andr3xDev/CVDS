package eci.edu.cvds.salud.service;

import eci.edu.cvds.salud.model.AppointmentModel;
import eci.edu.cvds.salud.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<AppointmentModel> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public AppointmentModel createNewAppointment(AppointmentModel appointmentModel) {
        return appointmentRepository.save(appointmentModel);
    }

    public Optional<AppointmentModel> getAppointmentById(String id){
        return appointmentRepository.findById(id);
    }

    public AppointmentModel getByStatus(String status){
        return appointmentRepository.findByStatus(status);
    }

    public void cancelAppointment(String id) {
        //Optional<AppointmentModel> app = this.getAppointmentById(id);
        appointmentRepository.deleteById(id);
    }
}
