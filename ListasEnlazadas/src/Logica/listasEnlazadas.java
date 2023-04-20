/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class listasEnlazadas {
	
	private nodo primero;
	private int tamano;
	
	public void verificaLista()
	{
		if(primero==null)
		{
			System.out.println("No hay datos en la lista");
		}
		else
		{
			System.out.println("La lista contiene datos");
		}
	}

	public void adicionarNodo(int dato)
	{
		nodo nuevo = new nodo(dato);
		nuevo.siguiente = primero;
		primero = nuevo;
		tamano++;
	}
	
	public int tamano()
	{
		return tamano;
	}
	
	public void listar()
	{
		nodo actual = primero;
		while(actual!= null) 
		{
			System.out.print("[" +actual.dato+"]-->");
			actual = actual.siguiente;
		}
	}
	
	public boolean existeDato(int dato)
	{
		nodo actual = primero;
		boolean bandera=false;
		
		if(actual!=null) {
			while(actual!=null)
			{
				if(actual.dato == dato)
				{
					bandera = true;
					System.out.println("Existe");
				}
				actual = actual.siguiente;
			}
			if(bandera== false)
			{
				System.out.println("No existe");
				
			}
		}
		return bandera;
	}
	
}
