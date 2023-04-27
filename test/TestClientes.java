package test;
import Models.Clientes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClientes {

    @Test
    public void test(){
        String rut = "2027473";
        String idCliente = "666";
        int celular = 987654321;
        String nombre = "El Barto";
        String direccion = "Casa 666";
        String email = "elbarto666@HOTmail.com";

        Clientes clientes = new Clientes(rut, idCliente, celular, nombre, direccion, email);

        Assertions.assertEquals(rut, clientes.getRut());
        Assertions.assertEquals(idCliente, clientes.getIdCliente());
        Assertions.assertEquals(celular, clientes.getCelular());
        Assertions.assertEquals(nombre, clientes.getNombre());
        Assertions.assertEquals(direccion, clientes.getDireccion());
        Assertions.assertEquals(email, clientes.getEmail());
    }
}

