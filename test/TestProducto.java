package test;

import Models.Producto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TestProducto {
    @Test
    public void test() throws IOException {
        String idProducto = "62";
        String marca = "samsung";
        int precio = 542575;
        String Caracteristica1 = "amd";
        String Caracteristica2 = "32";
        String Caracteristica3 = "512";

        boolean productoexistente = false;
        BufferedReader reader = new BufferedReader(new FileReader("productos.csv"));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length >= 3 && data[0].equals(idProducto) && data[1].equals(marca) && Integer.parseInt(data[2]) == precio &&
                    (Caracteristica1.isEmpty() || data.length >= 4 && data[3].equals(Caracteristica1) &&
                    Caracteristica2.isEmpty() || data.length >= 5 && data[4].equals(Caracteristica2) &&
                    Caracteristica3.isEmpty() || data.length >= 6 && data[5].equals(Caracteristica3))) {
                productoexistente = true;
                break;
            }
        }
        reader.close();
        Assertions.assertTrue(productoexistente, "El producto no se encontró en el archivo CSV");
        Producto producto = new Producto(idProducto, marca,precio, Caracteristica1, Caracteristica2, Caracteristica3);

        Assertions.assertEquals(idProducto, producto.getIdProducto());
        Assertions.assertEquals(marca, producto.getMarca());
        Assertions.assertEquals(precio, producto.getPrecioUnitario());
        Assertions.assertEquals(Caracteristica1, producto.getCaracteristica1());
        Assertions.assertEquals(Caracteristica2, producto.getCaracteristica2());
        Assertions.assertEquals(Caracteristica3, producto.getCaracteristica3());

    }
}

