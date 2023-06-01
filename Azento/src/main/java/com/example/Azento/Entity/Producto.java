package com.example.Azento.Entity;
import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "Productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private double precio;
    @ManyToOne
    @JoinColumn(name = "id")
    private Categoria categoria;
    @Column
    private String imagen;
    @Column
    private String activo;
}
