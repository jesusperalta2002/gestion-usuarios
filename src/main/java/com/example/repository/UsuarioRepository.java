package com.ejemplo.repository;

import com.ejemplo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Aquí puedes definir consultas personalizadas si lo necesitas
    // Ejemplo: buscar por correo
    Usuario findByCorreo(String correo);
}
