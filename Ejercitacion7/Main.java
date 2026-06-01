package ejercicio7;

public class Main {
    public static void main(String[] args) {

        String[][] datos = {
            {"1. Mouse inalámbrico Logitech M185", "M101", "18500"},
            {"Teclado mecánico Redragon K552", "TE102", "54900"},
            {"Monitor Samsung 24\" Full HD", "MO103", "248000"},
            {"Auriculares HyperX Cloud Stinger", "A104", "89500"},
            {"Teclado inalámbrico Logitech MK270", "TE105", "41200"},
            {"Mouse gamer Redragon M607", "M106", "27800"},
            {"Disco SSD Kingston 480 GB", "D101", "87000"},
            {"Disco SSD NVMe Samsung 1 TB", "D102", "189000"},
            {"Pendrive Kingston 64 GB USB 3.0", "P103", "12400"},
            {"Disco rígido Seagate 1 TB 3.5\"", "D104", "54000"},
            {"Webcam Logitech C920 Full HD", "CAM101", "118000"}
        };

        Producto[] productos = new Producto[datos.length];

        for (int i = 0; i < datos.length; i++) {
            String nombre = datos[i][0];
            String codigo = datos[i][1];

            double precio = Double.parseDouble(datos[i][2]);

            productos[i] = new Producto(nombre, codigo, precio);
        }

        Inventario miInventario = new Inventario();

        for (Producto prod : productos) {
            miInventario.agregarProducto(prod);
        }
        miInventario.listarProductos();
        
        System.out.println("----------------------------------------");
        System.out.println("Cantidad total de productos en inventario: " + miInventario.cantidadProductos());
    }
}
       