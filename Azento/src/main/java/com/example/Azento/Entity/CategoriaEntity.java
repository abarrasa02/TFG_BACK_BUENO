package com.example.Azento.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "Azento_Categorias")
public class CategoriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
}
