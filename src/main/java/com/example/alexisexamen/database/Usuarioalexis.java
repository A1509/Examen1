package com.example.alexisexamen.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Column;

@Entity
@Table(name = "usuario", schema = "public")
@Data
public class Usuarioalexis {
    @Id
    @Column(name = "correo", length = 200)
    private String correo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "password", length = 300)
    private String password;

     @ManyToOne
    @JoinColumn(name = "fk_rol")
    private Usuariosrolesalexis rol;
    



    
}