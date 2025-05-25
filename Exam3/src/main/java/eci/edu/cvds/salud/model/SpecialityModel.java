package eci.edu.cvds.salud.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.PrimitiveIterator;

@Document(collection = "speciality")
@NoArgsConstructor
@AllArgsConstructor
public class SpecialityModel {
    @Id
    private String id;
    private String type;
    private List<String> doctors;

}