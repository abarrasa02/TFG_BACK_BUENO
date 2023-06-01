package DTO;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class PedidoDTO {
	    private Long id;
	    private UsuarioDTO usuario;
	    private Float total;
	    private LocalDateTime fechaPedido;
}
