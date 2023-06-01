
package DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class EnvioDTO {
    private Long id;
    private PedidoDTO pedido;
    private String metodoEnvio;
    private String direccionEnvio;
    private String ciudadEnvio;
    private String paisEnvio;
    private String codigoPostalEnvio;
}
