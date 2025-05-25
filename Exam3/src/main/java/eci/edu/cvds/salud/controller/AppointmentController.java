package eci.edu.cvds.salud.controller;

import eci.edu.cvds.salud.model.AppointmentModel;
import eci.edu.cvds.salud.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/app")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/create")
    public ResponseEntity<AppointmentModel> createUser(@RequestBody AppointmentModel appointmentModel) {
        AppointmentModel createdUser = appointmentService.createNewAppointment(appointmentModel);
        return ResponseEntity.ok(createdUser);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<AppointmentModel>> getAppointmentById(@PathVariable String id) {
        Optional<AppointmentModel> payment = appointmentService.getAppointmentById(id);
        if (payment != null) {
            return ResponseEntity.ok(payment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<AppointmentModel> getAppointmentByStatus(@RequestBody String status) {
        AppointmentModel createdUser = appointmentService.getByStatus(status);
        return ResponseEntity.ok(createdUser);
    }

}
