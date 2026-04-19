package com.duoc.Semana6.service;

import com.duoc.Semana6.model.Videojuego;
import com.duoc.Semana6.repository.VideojuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Service
public class VideojuegoService {

    @Autowired
    private VideojuegoRepository repositorio;

    @PostConstruct
    public void cargarDatos() {
        repositorio.save(new Videojuego("The Legend of Zelda", 45000, "Nintendo Switch", true));
        repositorio.save(new Videojuego("Mario Kart 8", 30000, "Nintendo Switch", true));
        repositorio.save(new Videojuego("Pokopia", 60000, "Nintendo Switch 2", true));
    }

    public List<Videojuego> listarTodos() {
        return repositorio.findAll();
    }

    public Optional<Videojuego> buscarPorId(int id) {
        return repositorio.findById(id);
    }

    public List<Videojuego> buscarPorTitulo(String titulo) {
        return repositorio.findByTituloContainingIgnoreCase(titulo);
    }

    public List<Videojuego> listarPorPlataforma(String plataforma) {
        return repositorio.findByPlataforma(plataforma);
    }

}