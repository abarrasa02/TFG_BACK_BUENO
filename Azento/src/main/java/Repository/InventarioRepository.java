package Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Azento.Entity.InventarioEntity;

public interface InventarioRepository extends JpaRepository<InventarioEntity,Long> {

	
	@Query("Select i from InventarioEntity i where i.talla.id =:idTalla AND"
			+ "i.producto.id= :idProducto")
	Optional<InventarioEntity> findByProAndTalla(@Param ("idTalla")Long idTalla, @Param("idProducto")Long idProducto);

}
