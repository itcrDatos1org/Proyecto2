package EstructuraDeDatos;
//declaracion de la clase Lista
public class LinkedList <T>{
	private Nodo <T> head;
	private int capacidad;
	//----Creacion del constructor
	public LinkedList(){
        this.head=null;
        this.capacidad=0;
        }
	//----------------------------------------------Metodo Insertar
	public void insertarFinal(T dato){
        insertarFinalP(dato);
    }
	
	private void insertarFinalP(T dato){
        if (esVacia()) {
            this.head=new Nodo<T>(dato);;
            capacidad++;
        }else{
            Nodo<T> actual = head;
            while (actual.getSiguiente() != null){
                actual=actual.getSiguiente();
            }
            Nodo<T> aux = new Nodo(dato);
            aux.setSiguiente(null);
            actual.setSiguiente(aux);
            capacidad++;
        }
    }
	
	
	//------------------------------------------------Metodo Es vacia
	public boolean esVacia(){
        if (capacidad==0){
            return true;
        }else {
            return false;
        }
    }
	
	//------------------------------------------------

}
