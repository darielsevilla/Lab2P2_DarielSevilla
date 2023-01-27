/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_darielsevilla;

import java.awt.Color;

/**
 *
 * @author HP
 */
public class Casa {
    private String nombre;
    private int bloque;
    private Color color;
    private int ancho;
    private int largo;
    private int numb;
    private int cuartos;
    private String owner = "";

    public Casa(String nombre, int bloque, Color color, int ancho, int largo, int numb, int cuartos) {
        this.nombre = nombre;
        this.bloque = bloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.numb = numb;
        this.cuartos = cuartos;
    }
    
    public Casa(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }
    
    public String toString(){
        String resp = "nombre: " + nombre +"\n"
                + "bloque: " + bloque + "\n"
                + "color: " + color + "\n"
                + "ancho: " + ancho + "\n"
                + "largo: " + largo + "\n"
                + "numero de baños: " + numb + "\n"
                + "numero de cuartos: " + cuartos + "\n";
        if(owner != ""){
            resp += "dueño: " + owner + "\n";
        }
        return resp;
    }
    
}
