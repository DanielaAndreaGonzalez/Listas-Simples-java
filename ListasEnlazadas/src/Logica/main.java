package Logica;

public class main {
	
	public static void main(String [] args)
	{
		
		listasEnlazadas lista = new listasEnlazadas();
		
		lista.verificaLista();
		lista.adicionarNodo(10);
		lista.adicionarNodo(20);
		lista.adicionarNodo(30);
		lista.adicionarNodo(40);
		lista.adicionarNodo(50);
		lista.listar();
		lista.verificaLista();
		
		
		System.out.println("\n" + "Tamaño  "+lista.tamano());
		
		boolean existe = lista.existeDato(10);
		System.out.println(existe);
		
	}

}
