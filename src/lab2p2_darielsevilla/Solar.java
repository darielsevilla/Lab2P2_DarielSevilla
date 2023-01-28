/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_darielsevilla;

/**
 *
 * @author HP
 */
public class Solar {
    private int ancho;
    private int largo;
    private int area;
    private String owner = "";

    public Solar(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
        area = this.ancho * this.largo;
        
    }
    
    public Solar(){
        
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
        area = this.ancho * this.largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
        area = this.ancho * this.largo;
    }

    public String getOwner() {
        return owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public String toString(){
        String resp = "ancho: " + ancho +"\n"
                + "largo: " + largo + "\n"
                + "area: " + area + "\n";
        if(owner != ""){
            resp += "dueño: " + owner + "\n";
        }
        return resp;
    }
    
}
