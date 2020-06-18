package co.edu.ufps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ufps.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
