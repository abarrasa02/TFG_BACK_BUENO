package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Azento.Entity.ProductoEntity;


public interface ProductoRepository   extends JpaRepository<ProductoEntity,Long>{

}
