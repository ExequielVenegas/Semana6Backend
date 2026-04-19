package com.duoc.Semana6.controller;

import com.duoc.Semana6.model.Videojuego;
import com.duoc.Semana6.service.VideojuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/videojuegos")
public class VideojuegoController {

    @Autowired
    private VideojuegoService servicio;

    @GetMapping
    public List<Videojuego> listarTodos() {
        return servicio.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Videojuego> buscarPorId(@PathVariable int id) {
        return servicio.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/titulo/{titulo}")
    public List<Videojuego> buscarPorTitulo(@PathVariable String titulo) {
        return servicio.buscarPorTitulo(titulo);
    }

    @GetMapping("/plataforma/{plataforma}")
    public List<Videojuego> listarPorPlataforma(@PathVariable String plataforma) {
        return servicio.listarPorPlataforma(plataforma);
    }

}