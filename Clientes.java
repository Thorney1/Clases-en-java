public class Clientes {
    private String rut;
    private String idCliente;
    private int edad;
    private String nombre;
    private String direccion;
    private String email;

    public Clientes(String rut, String idCliente, int edad, String nombre, String direccion, String email) {
        this.rut = rut;
        this.idCliente = idCliente;
        this.edad = edad;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
    }

    @Override
    public String toString() {
        return "RUT: " + rut + ", Cliente: " + idCliente + ", Nombre: " + nombre + ", Direccion: " + direccion + ",Edad: " + edad + ", Email: " + email;
    }
}