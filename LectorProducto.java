import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorProducto {
    public void lectorProducto(String[] args) {
        // Ruta del archivo CSV con los datos de los clientes
        String filePath = "productos.csv";

        try {
            // Abrimos el archivo y creamos un lector de BufferedReader
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Leemos la primera línea (cabecera) del archivo y la descartamos
            String line = bufferedReader.readLine();

            // Leemos el resto de líneas del archivo
            while ((line = bufferedReader.readLine()) != null) {
                // Separamos los campos de la línea por la coma ","
                String[] fields = line.split(",");

                // Creamos un objeto Clientes con los datos de la línea
                Producto producto = new Producto(Integer.parseInt(fields[0]), fields[1], Integer.parseInt(fields[2]));

                System.out.println(producto.toString());

            }
            // Cerramos el lector de BufferedReader y el archivo
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

