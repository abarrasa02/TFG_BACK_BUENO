package Providers;


import java.util.Optional;

import com.example.Azento.Entity.UsuarioEntity;

import DTO.UsuarioDTO;
import Repository.UsuarioRepository;

public class UsuarioProvider {

	UsuarioRepository userRepository;
	
	 private UsuarioEntity convertDtoToEntity(UsuarioDTO userDto) {
		 UsuarioEntity user = new UsuarioEntity();
	        user.setNombre(userDto.getNombre());
	        user.setApellido(userDto.getApellido());
	        user.setEmail(userDto.getEmail());
	        user.setContrasena(userDto.getContrasena());
	        user.setDireccion(userDto.getDireccion());
	        user.setCiudad(userDto.getCiudad());
	        user.setPais(userDto.getPais());
	        user.setCodigoPostal(userDto.getCodigoPostal());
	        user.setTelefono(userDto.getTelefono());
	        user.setActivo(userDto.getActivo());
	        return user;
	    }
	
	  public String addUser(UsuarioDTO userDto) {
	        try {
	            Long contEmail = userRepository.findByEmail(userDto.getEmail());
	            if(contEmail > 0) {
	                return "El correo ya esta en uso";
	            } else {
	                UsuarioEntity user = convertDtoToEntity(userDto);
	                userRepository.save(user);
	                return "Usuario añadido exitosamente";
	            }
	            
	        } catch(Exception e) {
	            // manejar la excepción de forma adecuada
	            return "Error al añadir usuario: " + e.getMessage();
	        }
	    }
	  public String deleteUser(Long id) {
	        try {
	            Optional<UsuarioEntity> userOptional = userRepository.findById(id);
	            
	            if(userOptional.isPresent()) {
	            	UsuarioEntity user = userOptional.get();
	                user.setActivo("N");
	                userRepository.save(user);
	                return "Usuario desactivado exitosamente";
	            } else {
	                return "Usuario no encontrado";
	            }

	        } catch(Exception e) {
	            // manejar la excepción de forma adecuada
	            return "Error al desactivar usuario: " + e.getMessage();
	        }
	    }
	  
	  public String updateUser(UsuarioDTO userDto) {
	        try {
	            Optional<UsuarioEntity> userOptional = userRepository.findById(userDto.getId());
	            
	            if(userOptional.isPresent()) {
	            	UsuarioEntity user = userOptional.get();

	                user.setNombre(userDto.getNombre());
	                user.setApellido(userDto.getApellido());
	                user.setContrasena(userDto.getContrasena());
	                user.setDireccion(userDto.getDireccion());
	                user.setCiudad(userDto.getCiudad());
	                user.setPais(userDto.getPais());
	                user.setCodigoPostal(userDto.getCodigoPostal());
	                user.setTelefono(userDto.getTelefono());

	                userRepository.save(user);
	                return "Usuario actualizado exitosamente";
	            } else {
	                return "Usuario no encontrado";
	            }

	        } catch(Exception e) {
	            // manejar la excepción de forma adecuada
	            return "Error al actualizar usuario: " + e.getMessage();
	        }
	    }
}
