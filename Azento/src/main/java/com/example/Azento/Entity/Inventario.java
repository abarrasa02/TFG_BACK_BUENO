package com.example.Azento.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Inventarios")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id")
    private Talla talla;

    private int cantidad;
}
