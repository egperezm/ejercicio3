/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.programadore.inventario;

/**
 *
 * @author perez
 */
// Clase principal para probar la funcionalidad
public class Inventario {

    public static void main(String[] args) {

        // Crear un producto electrónico
        Electronico radio = new Electronico("Radios FX490", 8000.0, 9);

        // Consultar inventario
        radio.consultarInventario();

        // Agregar cantidad al inventario
        radio.agregarCantidad(3);

        // Consultar inventario después de agregar cantidad
        radio.consultarInventario();

        // Vender cantidad
        radio.vender(8);

        // Intentar vender más de lo disponible
        radio.vender(10);

        // Consultar inventario final
        radio.consultarInventario();
    }
}
