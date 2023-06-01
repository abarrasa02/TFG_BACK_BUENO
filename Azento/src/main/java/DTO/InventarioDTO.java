package DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class InventarioDTO {
	 	private Long id;
	    private ProductoDTO producto;
	    private TallaDTO talla;
	    private int cantidad;
}
