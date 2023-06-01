package DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductoDTO {
	  
    private Long id;
    private String nombre;
    private String descripcion;
    private double precio;
    private CategoriaDTO categoria;
    private String imagen;
    private String activo;
}
