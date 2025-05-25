package eci.edu.cvds.salud.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "appointments")
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentModel {
    @Id
    private String id;
    private String usercc;
    private String userName;

    private String userMail;
    private String doctor;
    private String speciality;
    private String status;
}
