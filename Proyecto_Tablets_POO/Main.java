package org.example;


import org.example.controlador.ControladorTablets;
import org.example.persistencia.ConexionSingleton;
import org.example.vista.VentanaTablets;


public class Main {
    public static void main(String[] args) {
        VentanaTablets view = new VentanaTablets("Proyecto Final Tablets");
        ControladorTablets controller = new ControladorTablets(view);
    }
}