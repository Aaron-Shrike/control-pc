/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_Datos;

import capa_Logica.Computadora;
import java.util.ArrayList;

/**
 *
 * @author Sh
 */
public class ListaComputadoras {
    private static ArrayList<Computadora> objetos = new ArrayList<Computadora>();
    
    public static void agregar(Computadora objC){
        objetos.add(objC);
    }
    
    public static ArrayList obtener(){
        return objetos;
    }
    
    public static int buscarxserie(String numeroserie){
        int pos = -1;
        
        for(int i=0; i<objetos.size(); i++){
            
            Computadora objC = (Computadora)objetos.get(i);
            
            if(objC.getNumserie().equalsIgnoreCase(numeroserie)){
                pos = i;
                
                break;
            }
        }
        return pos;
    }
    
    public static void modificar(int pos, Computadora objC){
        objetos.set(pos, objC);
    }
}
