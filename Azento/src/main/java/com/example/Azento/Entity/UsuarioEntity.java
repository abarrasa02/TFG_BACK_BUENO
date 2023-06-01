package com.example.Azento.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Usuarios")
public class UsuarioEntity {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		@Column
	    private String nombre;
		@Column
	    private String apellido;
		@Column
	    private String email;
		@Column
	    private String contrasena;
		@Column
		private String user;
		@Column
	    private String direccion;
		@Column
	    private String ciudad;
		@Column
	    private String pais;
		@Column
	    private String codigoPostal;
		@Column
	    private String telefono;
		@Column
		private String activo;
}
