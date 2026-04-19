package com.duoc.Semana6.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private int precio;
    private String plataforma;
    private boolean disponibilidad;

    public Videojuego() {}

    public Videojuego(String titulo, int precio, String plataforma, boolean disponibilidad) {
        this.titulo = titulo;
        this.precio = precio;
        this.plataforma = plataforma;
        this.disponibilidad = disponibilidad;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public int getPrecio() { return precio; }
    public String getPlataforma() { return plataforma; }
    public boolean isDisponibilidad() { return disponibilidad; }
}