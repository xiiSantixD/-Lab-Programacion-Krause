package ejercicio7;

public class Libro {
		private String titulo;
	    private String isbn;
	    private int cantidadPaginas;

	    public Libro(String titulo, String isbn, int cantidadPaginas) {
	        this.titulo = titulo;
	        this.isbn = isbn;
	        this.cantidadPaginas = cantidadPaginas;
	    }

	    public int getCantidadPaginas() {
	        return cantidadPaginas;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void mostrarInfo() {
	        System.out.println("ISBN: " + isbn + " | Titulo: \"" + titulo + "\" | Paginas: " + cantidadPaginas);
	    }
	}