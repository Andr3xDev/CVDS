package eci.edu.cvds.salud.service;

import eci.edu.cvds.salud.model.AppointmentModel;
import eci.edu.cvds.salud.model.UserModel;
import eci.edu.cvds.salud.repository.AppointmentRepository;
import eci.edu.cvds.salud.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class appointentServiceTest {
    @Mock
    private AppointmentRepository appointmentRepository;

    @InjectMocks
    private AppointmentService appointmentService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldCreateUser() {
        AppointmentModel model = new AppointmentModel();

        when(appointmentRepository.save(model)).thenReturn(model);

        AppointmentModel modeline = appointmentService.createNewAppointment(model);

        assertNotNull(modeline);
    }

    @Test
    void getAppointmentById() {
        AppointmentModel model = new AppointmentModel();

        when(appointmentRepository.findById("1")).thenReturn(Optional.of(model));

        Optional<AppointmentModel> modeline = appointmentService.getAppointmentById("1");

        assertNotNull(modeline);
    }

    @Test
    void getAppointmentBystatus() {
        AppointmentModel model = new AppointmentModel();

        when(appointmentRepository.findByStatus("1")).thenReturn(model);

        AppointmentModel modeline = appointmentService.getByStatus("1");

        assertNotNull(modeline);
    }
}
