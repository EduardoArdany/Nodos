
import modelos.Lista;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista nuevaLista = new Lista();
        nuevaLista.InsertarNodo(10);
        nuevaLista.InsertarNodo(20);
        nuevaLista.InsertarNodo(30);
        nuevaLista.ListarNodos();
    }
    
}
