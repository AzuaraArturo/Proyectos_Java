package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Tablets {
    private int id;
    private String url;
    private String marca;
    private String modelo;
    private float pulgadas;
    private int capacidad;

    public Tablets() {
    }

    public Tablets(int id, String url, String marca, String modelo, float pulgadas, int capacidad) {
        this.id = id;
        this.url = url;
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Tablets{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pulgadas=" + pulgadas +
                ", capacidad=" + capacidad +
                '}';
    }
    public ImageIcon getImagen() throws MalformedURLException {
        URL urlImagen = new URL(this.url);
        return new ImageIcon(urlImagen);
    }
}
