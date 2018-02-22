package Biblioteca;

public class Uso_Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instancias
		Libro libro1=new Libro("El Quijote de La Mancha", "Miguel de Cervantes", 2, 0);
		
		Libro libro2=new Libro("El Capitán Alatriste", "Arturo Pérez Reverte", 1, 0);
		
		Libro libro3=new Libro("Como agua para chocolate", "Laura Esquivel", 3, 0);
		
		Libro libro4=new Libro("84, Charing Cross Road", "Helene Hanff", 2, 1);
		
		Libro libro5=new Libro("Ensayo sobre la ceguera", "José Saramago", 1, 0);
		//Se muestran los libros disponibles
		System.out.println("Los libros disponibles son:");
		
		System.out.println(libro1.toString());
		
		System.out.println(libro2.toString());
		
		System.out.println(libro3.toString());
		
		System.out.println(libro4.toString());
		
		System.out.println(libro5.toString());
		//Préstamo del libro2, este si se presta
		if(libro2.prestaLibros()) {
			
			System.out.println("Se ha prestado el libro " + libro2.dameTitulo());
			
		}
		
		else {
			
			System.out.println("No hay más ejemplares del libro " + libro2.dameTitulo());
		}
		//Otro préstamo del libro2, este no se presta
		if(libro2.prestaLibros()) {
			
			System.out.println("Se ha prestado el libro " + libro2.dameTitulo());
			
		}
		
		else {
			
			System.out.println("No hay más ejemplares del libro " + libro2.dameTitulo());
		}
		//Devolución del libro4
		if(libro4.devuelveLibros()) {
			
			System.out.println("Se ha devuelto el libro " + libro4.dameTitulo());
			
		}
		
		else {
			
			System.out.println("No hay ejemplares prestados del libro " + libro4.dameTitulo());
			
		}
		//Devolución del libro3, no habia sido prestado
		if(libro3.devuelveLibros()) {
			
			System.out.println("Se ha devuelto el libro " + libro3.dameTitulo());
			
		}
		
		else {
			
			System.out.println("No hay ejemplares prestados del libro " + libro3.dameTitulo());
			
		}
		
	}

}
