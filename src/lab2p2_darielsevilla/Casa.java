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
    private int numero;
    private int bloque;
    private Color color;
    private int ancho;
    private int largo;
    private int numb;
    private int cuartos;
    private String estado;
    private String[] estados = {"En espera de construccion", "En construccion", "Lista", "En espera de demolicion", "Demolida"};
    private String owner = "";

    public Casa(int num, int bloque, Color color, int ancho, int largo, int numb, int cuartos) {
        this.numero = num;
        this.bloque = bloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.numb = numb;
        this.cuartos = cuartos;
    }
    
    public Casa(){
        
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
        String resp = "nombre: " + numero +"\n"
                + "bloque: " + bloque + "\n"
                + "color: " + color + "\n"
                + "ancho: " + ancho + "\n"
                + "largo: " + largo + "\n"
                + "numero de baños: " + numb + "\n"
                + "numero de cuartos: " + cuartos + "\n"
                + "estado: " + estado +"\n";
        if(owner != ""){
            resp += "dueño: " + owner + "\n";
        }
        return resp;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado() {
        int pos = 0;
        for (String estado1 : estados) {
            if(estado1 == estado){
                break;
            }else{
                pos++;
            }
        }
        
        if(pos != estados.length-1){
            estado = estados[pos+1];
        }
    }
    
    
    
}
