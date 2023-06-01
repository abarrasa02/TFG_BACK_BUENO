package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Azento.Entity.UsuarioEntity;



@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long> {

	@Query
	("SELECT COUNT(u) FROM  UsuarioEntity u WHERE u.email = :email")
	Long findByEmail(@Param("email")String email);
}
