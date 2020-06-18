package co.edu.ufps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ufps.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer>{

}
