package plataforma_academica.plataforma_academica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoUsuario;

    private String name;
    private String email;
    private String password;

    // Insertando el enum
    RoleEnum role;

    private boolean active = true;

}
