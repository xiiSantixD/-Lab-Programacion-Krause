package ejercitacion8;

public class Main {

    public static void main(String[] args) {

        Mundial mundial = new Mundial();

        Seleccion argentina = new Seleccion("Argentina", "America", 9, 26, true);
        Seleccion brasil = new Seleccion("Brasil", "America", 6, 10, true);
        Seleccion japon = new Seleccion("Japon", "Asia", 4, 23, false);

        DirectorTecnico scaloni = new DirectorTecnico("Lionel Scaloni", 48, "Argentina");

        argentina.setDirectorTecnico(scaloni);

        mundial.agregarSeleccion(argentina);
        mundial.agregarSeleccion(brasil);
        mundial.agregarSeleccion(japon);

        mundial.consultarSeleccion(0);

        mundial.consultarSeleccion(8);

        mundial.actualizarPuntos(0, "12");

        mundial.actualizarPuntos(0, "abc");

        mundial.mostrarDirectorTecnico(0);

        mundial.mostrarDirectorTecnico(1);

        try {

            brasil.jugarPartido();

        } catch (JugadoresInsuficientes e) {

            System.out.println(e.getMessage());

        }

        try {

            Seleccion prueba = new Seleccion("Prueba", "Europa", 0, 30, false);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

    }

}