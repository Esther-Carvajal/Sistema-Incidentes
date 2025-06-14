package com.universidad.registro.repository;


import com.universidad.registro.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    Optional<Rol> findByNombre(Rol.NombreRol nombre);
    boolean existsByNombre(Rol.NombreRol nombre);
}
