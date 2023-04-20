/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class ListaEnlazadaOrden {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		 ListaEnlazadaOrden lista = new ListaEnlazadaOrden();
	        lista.verifiaLista();
	        lista.adicionarNodo(10);
	        //lista.adicionarNodo(10);
	        lista.adicionarNodo(30);
	        lista.adicionarNodo(40);
	        lista.adicionarNodo(50);
	        lista.adicionarNodo(20);
	        lista.listar();
	        
		
		
	}
	
	 private nodo primero;
	    private int tamano;
	    public void verifiaLista(){
	        if (primero==null)
	        {
	            System.out.println("No hay datos en la lista");
	        }else{
	            System.out.println("La lista contiene datos");
	        }
	    }
	    public void adicionarNodo(int dato)
	    {
	        nodo valor1,valor2;
	        nodo nuevo= new nodo(dato);
	        if (primero==null)
	        {
	            primero=nuevo;
	            nuevo.siguiente=null;
	        }else{
	          valor1=primero;
	          while(valor1!=null)
	          {
	             valor2=valor1.siguiente;
	             //verifico si el dato nuevo es menor
	             if(nuevo.dato<=valor1.dato)
	             {
	                 nuevo.siguiente=primero;
	                 primero=nuevo;
	                 break;
	             }else{
	               //verifico si el dato nuevo es mayor
	                     if(nuevo.dato>valor1.dato && valor2==null){
	                         valor1.siguiente=nuevo;
	                         nuevo.siguiente=null;
	                         break;
	                        }else{
	                         //verifico si el dato nuevo está entre dos datos
	                         if(valor1.dato<nuevo.dato && valor2.dato>nuevo.dato)
	                         {
	                             valor1.siguiente=nuevo;
	                             nuevo.siguiente=valor2;
	                             break;
	                         }else{
	                            valor1=valor1.siguiente;
	                         }
	                     }
	                    }
	            }
	        }
	        tamano++;
	    }


	        //nuevo.siguiente=primero;
	        //primero=nuevo;
	    
	    public int tamano()
	    {
	        return tamano;
	    }
	    public void listar()
	    {
	        nodo actual =primero;
	        while(actual!=null){
	            System.out.print("["+actual.dato+"]-->");
	            actual=actual.siguiente;
	        }
	    }
	    
	}
	
	
	
	


