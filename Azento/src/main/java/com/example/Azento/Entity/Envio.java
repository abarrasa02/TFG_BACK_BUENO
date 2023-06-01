package com.example.Azento.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Azento_Envios")
public class Envio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "IDPedido")
    private Pedido pedido;

    @Column(name = "MetodoEnvio")
    private String metodoEnvio;

    @Column(name = "DireccionEnvio")
    private String direccionEnvio;

    @Column(name = "CiudadEnvio")
    private String ciudadEnvio;

    @Column(name = "PaisEnvio")
    private String paisEnvio;

    @Column(name = "CodigoPostalEnvio")
    private String codigoPostalEnvio;
}