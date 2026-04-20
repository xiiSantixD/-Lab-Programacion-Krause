package Ejercitacion3;

public class Main {
    public static void main(String[] args) {
        
        Herramienta h1 = new Herramienta("Martillo");
        Herramienta h2 = new Herramienta("Destornillador");
        Herramienta h3 = new Herramienta("Pinza");
        Herramienta h4 = new Herramienta("Taladro");
        Herramienta h5 = new Herramienta("Sierra");

        Libro[] listaLibros = {
            new Libro("Don Quijote"), new Libro("Rayuela"), 
            new Libro("Ficciones"), new Libro("1984"), new Libro("Hamlet")
        };
        Socio s1 = new Socio("Jose", listaLibros);
        Socio s2 = new Socio("Alex", listaLibros);
        Socio s3 = new Socio("Leonel", listaLibros);

        Vehiculo[] lote1 = {new Vehiculo("Sedan"), new Vehiculo("SUV"), new Vehiculo("Pickup")};
        Vehiculo[] lote2 = {new Vehiculo("Coupe"), new Vehiculo("Van"), new Vehiculo("Hatchback")};
        Vehiculo[] lote3 = {new Vehiculo("Moto"), new Vehiculo("Camion"), new Vehiculo("Tesla"), new Vehiculo("Jeep")};

        Vendedor v1 = new Vendedor("Santiago", lote1);
        Vendedor v2 = new Vendedor("Manuel", lote2);
        Vendedor v3 = new Vendedor("Diego", lote3);

        Animal perroCompartido = new Animal("Firulais", "Perro");
        
        Animal a1 = new Animal("Michi", "Gato");
        Animal a2 = new Animal("Luna", "Perro");
        Animal a3 = new Animal("Simba", "Gato");
        Animal a4 = new Animal("Toby", "Perro");
        Animal a5 = new Animal("Pelusa", "Gato");
        Animal a6 = new Animal("Freddy", "Perro");

        Veterinario vet1 = new Veterinario("Dr Rodriguez", new Animal[]{perroCompartido, a1, a2});
        Veterinario vet2 = new Veterinario("Dr Juarez", new Animal[]{perroCompartido, a3, a4});
        Veterinario vet3 = new Veterinario("Dr Rondal", new Animal[]{perroCompartido, a5, a6});

        System.out.println("Configuracion completada con exito ");
        System.out.println("El animal compartido es: " + vet1.pacientes[0].nombre);
        
        System.out.println("=== HERRAMIENTAS ===");
        System.out.println(h1.nombre);
        System.out.println(h2.nombre);
        System.out.println(h3.nombre);
        System.out.println(h4.nombre);
        System.out.println(h5.nombre);
        
        System.out.println("=== GESTIÓN DE SOCIOS Y LIBROS ===");
        
        System.out.println("Socio: " + s1.nombre + " tiene " + s1.librosCargo.length + " libros.");
        System.out.println("Socio: " + s2.nombre + " tiene " + s2.librosCargo.length + " libros.");
        System.out.println("Socio: " + s3.nombre + " tiene " + s3.librosCargo.length + " libros.");
        
        System.out.println("\n=== GESTIÓN DE VENDEDORES ===");
        
        System.out.println(v1.nombre + " tiene " + v1.flota.length + " vehículos.");
        System.out.println(v2.nombre + " tiene " + v2.flota.length + " vehículos.");
        System.out.println(v3.nombre + " tiene " + v3.flota.length + " vehículos.");

        System.out.println("\n=== CONTROL VETERINARIO (Animal compartido) ===");
        
        System.out.println(vet1.nombre + " atiende a: " + vet1.pacientes[0].nombre);
        System.out.println(vet2.nombre + " atiende a: " + vet2.pacientes[0].nombre);
        System.out.println(vet3.nombre + " atiende a: " + vet3.pacientes[0].nombre);
    }
}