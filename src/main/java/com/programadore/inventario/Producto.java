/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programadore.inventario;

/**
 *
 * @author perez
 */
    
// Clase abstracta Producto
abstract class Producto {
    // Atributos
    protected String nombre;
    protected double precio;
    protected int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Métodos abstractos
    public abstract void agregarCantidad(int cantidad);
    public abstract void vender(int cantidad);

    // Método concreto para consultar el inventario
    public void consultarInventario() {
        System.out.println("Producto: " + nombre + " - Cantidad en inventario: " + cantidad);
    }
}

// Clase concreta Electronico que extiende de Producto
class Electronico extends Producto {

    // Constructor
    public Electronico(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    // Implementación del método abstracto agregarCantidad
    @Override
    public void agregarCantidad(int cantidad) {
        this.cantidad += cantidad;
        System.out.println("Se han agregado " + cantidad + " unidades de '" + nombre + "' al inventario.");
    }

    // Implementación del método abstracto vender
    @Override
    public void vender(int cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
            System.out.println("Se han vendido " + cantidad + " unidades de '" + nombre + "'.");
        } else {
            System.out.println("No se puede vender " + cantidad + " unidades de '" + nombre + "'. Solo hay " + this.cantidad + " unidades disponibles.");
        }
    }
}