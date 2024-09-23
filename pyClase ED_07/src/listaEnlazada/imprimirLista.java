/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaEnlazada;

/**
 *
 * @author LAB-USR-LCENTRO
 */
public class imprimirLista {
    
    public static void main(String[] args){
        ListaEnlazada lista = new ListaEnlazada();
        
        Alumno Marcelo = new  Alumno("U2121", 968686, "soft", "inge");
        
        lista.insertarFin(Marcelo);
      

        
        lista.mostrarLista();
        
       
    }
}
