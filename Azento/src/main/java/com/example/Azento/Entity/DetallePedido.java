package com.example.Azento.Entity;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DetallesPedidos")
public class DetallePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "IDPedido")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "IDProducto")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "IDTalla")
    private Talla talla;
    
    @Column
    private int cantidad;
    
    @Column
    private BigDecimal precio;
}