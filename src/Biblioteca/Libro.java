package Biblioteca;

class Libro {
	//atributos
	private String titulo;
	
	private String autor;
	
	private int ejemplares;
	
	private int ejemplares_prestados;
	//constructor
	public Libro(String tit, String aut, int eje, int ejem) {
		
		titulo=tit;
		
		autor=aut;
		
		ejemplares=eje;
		
		ejemplares_prestados=ejem;
		
	}
	//getter
	public String dameTitulo() {
		
		return titulo;
		
	}
	//getter
	public String dameAutor() {
		
		return autor;
		
	}
	//getter
	public int dameEjemplares() {
		
		return ejemplares;
		
	}
	//método
	public boolean prestaLibros() {
				
		boolean prestado=true;
		
		if(ejemplares_prestados<ejemplares) {
			
			ejemplares_prestados++;
			
		}
		
		else {
			
			prestado=false;
			
		}
		
		return prestado;
		
	}
	//método
	public boolean devuelveLibros() {
		
		boolean devuelve=true;
		
		if(ejemplares_prestados==0) {
			
			devuelve=false;
			
		}
		
		else {
			
			ejemplares_prestados--;
			
		}
		
		return devuelve;
	}
	
	public String toString() {
		
		String mensaje="Título: " + titulo + " · Autor: " + autor + " · Ejemplares: " + ejemplares + " · Ejemplares prestados: " + ejemplares_prestados;
		
		return mensaje;
		
	}
	
}
