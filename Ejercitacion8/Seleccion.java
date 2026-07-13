package ejercitacion8;

public class Seleccion {

    private String nombre;
    private String continente;
    private int puntos;
    private int jugadoresConvocados;
    private boolean clasificada;
    private DirectorTecnico directorTecnico;

    public Seleccion(String nombre, String continente, int puntos,
                     int jugadoresConvocados, boolean clasificada) {

        this.nombre = nombre;
        this.continente = continente;
        this.puntos = puntos;
        this.clasificada = clasificada;

        setJugadoresConvocados(jugadoresConvocados);
    }

    public void setDirectorTecnico(DirectorTecnico directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public DirectorTecnico getDirectorTecnico() {
        return directorTecnico;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setJugadoresConvocados(int jugadoresConvocados) {
        if (jugadoresConvocados < 1 || jugadoresConvocados > 26) {
            throw new IllegalArgumentException("Cantidad de jugadores invalida");
        }
        this.jugadoresConvocados = jugadoresConvocados;
    }

    public void jugarPartido() throws JugadoresInsuficientes {
        if (jugadoresConvocados < 11) {
            throw new JugadoresInsuficientes(
                    "La seleccion no tiene suficientes jugadores para disputar el partido.");
        }

        System.out.println(nombre + " puede disputar el partido.");
    }

    @Override
    public String toString() {
        return "Seleccion: " + nombre +
                "\nContinente: " + continente +
                "\nPuntos: " + puntos +
                "\nJugadores: " + jugadoresConvocados +
                "\nClasificada: " + clasificada;
    }
}