/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author marti
 */
public class Compra {
    private int id;
    private Proveedor proveedor;
    private LocalDate fechaPedido;

    public Compra() {
    }

    public Compra(Proveedor proveedor, LocalDate fechaPedido) {
        this.proveedor = proveedor;
        this.fechaPedido = fechaPedido;
    }

    public Compra(int id, Proveedor proveedor, LocalDate fechaPedido) {
        this.id = id;
        this.proveedor = proveedor;
        this.fechaPedido = fechaPedido;
    }

    // Constructor, getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    
}