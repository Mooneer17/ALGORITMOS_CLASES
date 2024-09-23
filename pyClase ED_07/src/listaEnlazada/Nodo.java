
package listaEnlazada;

public class Nodo {
    //atributos
    private Alumno alumno;
    private Nodo sig;
    
    //constructor para insertar al inicio del nodo
    public Nodo(Alumno alumno){
        this.alumno= alumno;
        this.sig= sig;
    }
    
    //constructor para insertar al final del nodo
    
    public Nodo(int dato){
        this.alumno= alumno;
        this.sig= null;
    }

    public Alumno getDato() {
        return alumno;
    }

    public void setDato(int dato) {
        this.alumno = alumno;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    
}
