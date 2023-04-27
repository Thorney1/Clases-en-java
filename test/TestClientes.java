package test;

import Models.Clientes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestClientes {

    @Test
    public void test() throws IOException {
        String rut = "9684802";
        String nombre = "Otis Portwood";
        String idCliente = "0";
        String direccion = "328 17th Street";
        int celular = 908929960;
        String email = "otis.portwood@gmail.com";

        //Verificamos que el cliente existe en el archivo CSV
        //se inicia en false y luego se cambiara a true si se encuentra el cliente
        boolean encontrado = false;
        //leemos el archivo csv
        BufferedReader reader = new BufferedReader(new FileReader("clientes.csv"));
        String line;
        //se revisa cada linea mientras sea distinto de null
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            //entrara en el if si se comprueba que cada dato es igual al leido en el archivo clientes.csv
            if (data[0].equals(rut) && data[1].equals(nombre) && data[2].equals(idCliente) && data[3].equals(direccion) &&
                    Integer.parseInt(data[4]) == celular && data[5].equals(email)) {
                encontrado = true;
                break;
            }
        }
        reader.close();

        //Verificamos que se encontró el cliente
        Assertions.assertTrue(encontrado, "El cliente no se encontró en el archivo CSV");


        Clientes cliente = new Clientes(rut, nombre, idCliente, direccion, celular, email);

        Assertions.assertEquals(rut, cliente.getRut());
        Assertions.assertEquals(nombre, cliente.getNombre());
        Assertions.assertEquals(idCliente, cliente.getIdCliente());
        Assertions.assertEquals(direccion, cliente.getDireccion());
        Assertions.assertEquals(celular, cliente.getCelular());
        Assertions.assertEquals(email, cliente.getEmail());
    }
}
