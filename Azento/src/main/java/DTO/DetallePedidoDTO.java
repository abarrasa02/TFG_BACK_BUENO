package DTO;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class DetallePedidoDTO {
		private Long id;
	    private PedidoDTO pedido;
	    private ProductoDTO producto;
	    private TallaDTO talla;
	    private int cantidad;
	    private BigDecimal precio;
}
