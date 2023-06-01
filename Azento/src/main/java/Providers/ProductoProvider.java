package Providers;

import java.util.Optional;

import com.example.Azento.Entity.CategoriaEntity;
import com.example.Azento.Entity.ProductoEntity;

import DTO.ProductoDTO;
import Repository.CategoriaRepository;
import Repository.ProductoRepository;

public class ProductoProvider {
	
	 ProductoRepository productoRepository;
     CategoriaRepository categoriaRepository;
    
    public String addProduct(ProductoDTO productoDto, Long categoriaId) {
        try {
            ProductoEntity producto = new ProductoEntity();
            producto.setNombre(productoDto.getNombre());
            producto.setDescripcion(productoDto.getDescripcion());
            producto.setPrecio(productoDto.getPrecio());
            producto.setImagen(productoDto.getImagen());
            producto.setActivo(productoDto.getActivo());

            Optional<CategoriaEntity> categoriaOptional = categoriaRepository.findById(categoriaId);
            if (categoriaOptional.isPresent()) {
                producto.setCategoria(categoriaOptional.get());
            } else {
                return "Categoría no encontrada";
            }

            productoRepository.save(producto);
            return "Producto añadido exitosamente";

        } catch(Exception e) {
            // manejar la excepción de forma adecuada
            return "Error al añadir producto: " + e.getMessage();
        }
    }

    public String updateProduct( ProductoDTO productoDto) {
        try {
            Optional<ProductoEntity> productoOptional = productoRepository.findById(productoDto.getId());

            if(productoOptional.isPresent()) {
                ProductoEntity producto = productoOptional.get();
                producto.setNombre(productoDto.getNombre());
                producto.setDescripcion(productoDto.getDescripcion());
                producto.setPrecio(productoDto.getPrecio());
                producto.setImagen(productoDto.getImagen());

                Optional<CategoriaEntity> categoriaOptional = categoriaRepository.findById(productoDto.getCategoria().getId());
                if (categoriaOptional.isPresent()) {
                    producto.setCategoria(categoriaOptional.get());
                } else {
                    return "Categoría no encontrada";
                }

                productoRepository.save(producto);
                return "Producto actualizado exitosamente";
            } else {
                return "Producto no encontrado";
            }

        } catch(Exception e) {
            // manejar la excepción de forma adecuada
            return "Error al actualizar producto: " + e.getMessage();
        }
    }

    public String deleteProduct(Long id) {
        try {
            Optional<ProductoEntity> productoOptional = productoRepository.findById(id);

            if(productoOptional.isPresent()) {
                ProductoEntity producto = productoOptional.get();
                producto.setActivo("N");
                productoRepository.save(producto);
                return "Producto desactivado exitosamente";
            } else {
                return "Producto no encontrado";
            }

        } catch(Exception e) {
            // manejar la excepción de forma adecuada
            return "Error al desactivar producto: " + e.getMessage();
        }
    }
}
