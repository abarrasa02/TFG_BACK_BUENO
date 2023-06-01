package com.example.Azento.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Azento_HistorialCompras")
public class HistorialCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "IDUsuario")
    private UsuarioEntity usuario;

    @ManyToOne
    @JoinColumn(name = "IDPedido")
    private Pedido pedido;
}