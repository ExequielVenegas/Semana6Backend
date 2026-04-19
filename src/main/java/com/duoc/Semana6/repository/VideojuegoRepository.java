package com.duoc.Semana6.repository;

import com.duoc.Semana6.model.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {

    List<Videojuego> findByTituloContainingIgnoreCase(String titulo);
    List<Videojuego> findByPlataforma(String plataforma);

}