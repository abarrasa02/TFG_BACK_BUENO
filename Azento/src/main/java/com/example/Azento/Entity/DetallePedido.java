package com.example.Azento.Entity;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Azento_DetallesPedidos")
public class DetallePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "IDPedido")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "IDProducto")
    private ProductoEntity producto;

    @ManyToOne
    @JoinColumn(name = "IDTalla")
    private Talla talla;
    
    @Column
    private int cantidad;
    
    @Column
    private BigDecimal precio;
}