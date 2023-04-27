package Models;

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
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "RUT: " + rut + ", Cliente: " + idCliente + ", Nombre: " + nombre + ", Direccion: " + direccion + ",Edad: " + edad + ", Email: " + email;
    }
}