package DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class InventarioDTO {
	 	private Long id;
	    private Long producto;
	    private Long talla;
	    private int cantidad;
}
