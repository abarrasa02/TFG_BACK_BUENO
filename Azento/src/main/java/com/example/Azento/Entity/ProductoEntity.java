package com.example.Azento.Entity;
import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "Azento_Productos")
public class ProductoEntity {
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
    private CategoriaEntity categoria;
    @Column
    private String imagen;
    @Column
    private String activo;
}
