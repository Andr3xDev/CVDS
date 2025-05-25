package eci.edu.cvds.salud.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    @Id
    private String id;
    private String cc;
    private String name;
    private String mail;
    private String type;
}
