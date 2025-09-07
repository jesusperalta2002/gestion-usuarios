package com.ejemplo.controller;

import com.ejemplo.model.Usuario;              // ✅ IMPORT QUE FALTABA
import com.ejemplo.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioRepository repo;

    public UsuarioController(UsuarioRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Usuario> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Usuario agregar(@RequestBody Usuario est) {
        return repo.save(est);
    }

    @GetMapping("/{id}")
    public Usuario obtener(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}

