/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaEnlazada;

/**
 *
 * @author LAB-USR-LCENTRO
 */
public class Alumno {
    String codigo;
    int numero;
    String esp;
    String cat;

    public Alumno(String codigo, int numero, String esp, String cat) {
        this.codigo = codigo;
        this.numero = numero;
        this.esp = esp;
        this.cat = cat;
    }
    
   @Override
    public String toString() {
        return "Alumno{codigo='" + codigo + "', numero=" + numero + ", especialidad='" + esp + "', categoria='" + cat + "'}";
    }
    
}
