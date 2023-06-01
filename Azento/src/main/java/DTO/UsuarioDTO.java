package DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UsuarioDTO {
	
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String contrasena;
    private String user;
    private String direccion;
    private String ciudad;
    private String pais;
    private String codigoPostal;
    private String telefono;
    private String activo;
}
