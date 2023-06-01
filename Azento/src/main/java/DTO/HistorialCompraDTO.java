package DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class HistorialCompraDTO {
	private Long id;
    private UsuarioDTO usuario;
    private PedidoDTO pedido;
    
}
