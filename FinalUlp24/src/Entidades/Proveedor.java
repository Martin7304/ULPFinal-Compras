/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author marti
 */
public class Proveedor {
    private int id;
    private String razonSocial;
    private String direccion;
    private int telefono;

    public Proveedor() {
    }

    public Proveedor( String razonSocial, String direccion, int telefono) {

        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Proveedor(int id, String nombreCompleto, String razonSocial, String direccion, int telefono) {
        this.id = id;

        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
    }



    // Constructor, getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }







}

