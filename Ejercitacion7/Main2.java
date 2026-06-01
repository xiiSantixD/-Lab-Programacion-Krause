package ejercicio7;

public class Main2 {
	public static void main(String[] args) {

		 String[][] datos = {
		            {"El Principito", "9789504000044", "3200"},
		            {"Donde viven los monstruos", "9789877381501", "2800"},
		            {"Matilda", "9788420432885", "4500"},
		            {"Charlie y la fábrica de chocolate", "9788420432878", "4500"},
		            {"El árbol generoso", "9789877380125", "2600"},
		            {"Harriet, la espía", "9788420401164", "5100"},
		            {"El ratón que se comió la luna", "9788416648931", "2200"},
		            {"Las aventuras de Pippi Mediaslargas", "9788420400891", "3900"},
		            {"El mago de Oz", "9789504000815", "3500"},
		            {"El hobbit", "9788445000687", "6200"}
		        };

		        Libro[] libros = new Libro[datos.length];

		        for (int i = 0; i < datos.length; i++) {
		            String titulo = datos[i][0];
		            String isbn = datos[i][1];
		            int paginas = Integer.parseInt(datos[i][2]); 

		            libros[i] = new Libro(titulo, isbn, paginas);
		        }

		        Biblioteca miBiblioteca = new Biblioteca();

		        for (Libro l : libros) {
		            miBiblioteca.agregarLibro(l);
		        }

		        miBiblioteca.listarLibros();
		        System.out.println("----------------------------------------");
		        System.out.println("Cantidad total de libros en la biblioteca: " + miBiblioteca.cantidadLibros());

		        int indiceBuscado = 5;
		        Libro libroEncontrado = miBiblioteca.obtenerLibroPorIndice(indiceBuscado);
		        
		        if (libroEncontrado != null) {
		            System.out.println("El libro en el índice (" + indiceBuscado + ") es: \"" + libroEncontrado.getTitulo() + "\"");
		            System.out.println("Tiene un total de: " + libroEncontrado.getCantidadPaginas() + " páginas.");
		        }
		    }
		}
