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
    private String owner = "";

   
    public Edificio(int pisos, int local, String direccion) {
        this.pisos = pisos;
        this.local = local;
        this.direccion = direccion;
        estado = estados[0];
    }
    
    public Edificio(){
       
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

     public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

    public void setEstado(int x) {
        if(x >= 0 && x < estados.length){
            estado = estados[x];
        }else{
            System.out.println("No hay un estado en esa posicion");
        }
    }
    
    public String toString(){
        String resp = "pisos: " + pisos + "\n"
                + "locales: " + local + "\n"
                + "direccion de referencias: " + direccion + "\n"
                + "estado: " + estado + "\n";
        
        if(owner != ""){
            resp += "dueño: " + owner + "\n";
        }
        
        return resp;
    }
    
    
}
