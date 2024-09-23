
package listaEnlazada;

public class ListaEnlazada {
    private Nodo inicio, fin;
    //constructor
    public ListaEnlazada(){
        this.inicio= null;
        this.fin= null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }
    
    //Método para insertar al inicio
    public void insertarIni(Alumno alumno){
        inicio= new Nodo(alumno);
        
        if(fin== null){
            fin= inicio;
        }
    }
    
    //Método para insertar al final
    public void insertarFin(Alumno alumno){
        if(inicio== null){
            inicio= fin= new Nodo(alumno);
        }else{
            fin.setSig(new Nodo(alumno));
            fin= fin.getSig();
        }
    }
    //Método para realizar el recorrido
    public void mostrarLista(){
        Nodo elemento= inicio;
        
        while(elemento!= null){
            System.out.print(elemento.getDato() + "--> ");
            elemento= elemento.getSig();
        }
        
    }
    
}
