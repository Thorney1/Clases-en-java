public class Clientes {
    String rut;
    int idCliente;
    String nombre;
    String direccion;
    String celular;
    String email;

    public Clientes(String rut, String nombre, int idCliente, String direccion, String celular, String email){
        this.rut = rut;
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.direccion = direccion;
        this.celular = celular;
        this.email = email;
    }
}
