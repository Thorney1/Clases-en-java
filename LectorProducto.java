import Models.Producto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class LectorProducto {
    public List<Producto> lectorProducto(String[] args) {
        // Ruta del archivo CSV con los datos de los clientes
        String filePath = "productos.csv";

        List<Producto> productos = new ArrayList<Producto>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(",");

                String caracteristica1 = fields.length >= 4 ? fields[3] : null;
                String caracteristica2 = fields.length >= 5 ? fields[4] : null;
                String caracteristica3 = fields.length == 6 ? fields[5] : null;

                //Creamos un objeto Models.Clientes con los datos de la línea
                Producto obj = new Producto(Integer.parseInt(fields[0]), fields[1], Integer.parseInt(fields[2]),caracteristica1,caracteristica2, caracteristica3);
                productos.add(obj);

            }
            // Cerramos el lector de BufferedReader y el archivo
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productos;
    }
}

