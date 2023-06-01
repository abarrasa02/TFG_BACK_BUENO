package com.example.Azento.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Azento_Inventario")
public class InventarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id")
    private ProductoEntity producto;

    @ManyToOne
    @JoinColumn(name = "id")
    private Talla talla;
    
    @Column
    private int cantidad;
}
