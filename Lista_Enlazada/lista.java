package Lista_Enlazada;

import java.util.List;

public class lista {

	Nodo_estacion inicio=null;	


		public void agregar (){
			
			if(inicio==null)
				inicio=new Nodo_estacion(dato);
			
			else {
				
				Nodo_estacion temp=inicio;
				inicio = new Nodo_estacion(dato);
				inicio.referencia = temp;
			}
}
		public void mostrar (){
			
			Nodo_estacion temp= inicio;
			
			if ( temp==null)
				System.out.println("lista vacia");
			else {
				while(temp!=null){
					
					System.out.println(temp.dato);
					temp = temp.referencia;
				}
				
			}
	
		}
		
	public  boolean buscar (){
		
		Nodo_estacion temp = inicio;
		
			while(temp!=null){
				
				if(temp.dato == dato)
					return true;
				else 
					temp = temp.referencia;
			}
			return  false;
			
			
	
				
			}
		
public static void main(String []args){
	lista lista = new lista();
	lista.agregar();
	lista.mostrar();
	lista.buscar();
	
}
}

