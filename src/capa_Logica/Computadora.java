/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_Logica;

/**
 *
 * @author Sh
 */
public class Computadora {
    private String  numserie;
    private String  marca;
    private String  color;
    private int     año;
    private String  estado;
    
    public static String[] t_estado = {"Operativo","Mantenimiento","Inoperativo"};
    
    public static String getT_estado(int indice) {
        return t_estado[indice];
    }
    
    public Computadora(){
        this.numserie = "";
        this.marca = "";
        this.color = "";
        this.año = 1990;
        this.estado = t_estado[0];        
    }
    
    public String getNumserie() {
        return numserie;
    }
    
    public void setNumserie(String numserie) {
        this.numserie = numserie;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getAño() {
        return año;
    }
    
    public void setAño(int año) {
        this.año = año;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public static String[] getT_estado() {
        return t_estado;
    }
    
    public static void setT_estado(String[] aT_estado) {
        t_estado = aT_estado;
    }
    
}
