/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_darielsevilla;

/**
 *
 * @author HP
 */
public class Edificio {
    private int pisos;
    private int local;
    private String direccion;
    private String estado;
    private String[] estados = {"En espera de construccion", "En construccion", "Lista", "En espera de demolicion", "Demolida"};
    private String owner;

    public Edificio(int pisos, int local, String direccion) {
        this.pisos = pisos;
        this.local = local;
        this.direccion = direccion;
    }
    
    public Edificio(){
       
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getLocal() {
        return local;
    }

    public void setLocal(int local) {
        this.local = local;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
}
