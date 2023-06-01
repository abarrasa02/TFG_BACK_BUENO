package Providers;

import java.util.Optional;

import com.example.Azento.Entity.InventarioEntity;

import DTO.InventarioDTO;
import Repository.InventarioRepository;
import Repository.ProductoRepository;

public class InventarioProvider {
	
	ProductoRepository productoRepository;
	InventarioRepository inventarioRepository;
	
	public  String ajustarInventario(InventarioDTO inventDto) {
		try {
			Optional<InventarioEntity> invent=inventarioRepository.findByProAndTalla(inventDto.getTalla(), inventDto.getProducto());
			if(!invent.isPresent()) {
				return "No se ha encontrado el producto en el inventario";
			}else {
				InventarioEntity inv=invent.get();
				inv.setCantidad(inventDto.getCantidad());
				inventarioRepository.save(inv);
				return "Se ha ajustado el inventario correctamente";
			}
		} catch (Exception e) {
			return "Error al actualizar el inventario: " + e.getMessage();
		}
	}
	
	
}
