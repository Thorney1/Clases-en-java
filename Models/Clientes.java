package Models;

public class Clientes {
    private String rut;
    private String idCliente;
    private int celular;
    private String nombre;
    private String direccion;
    private String email;



    public Clientes(String rut, String idCliente, int celular, String nombre, String direccion, String email) {
        this.rut = rut;
        this.idCliente = idCliente;
        this.celular = celular;
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
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
        return "RUT: " + rut + ", Cliente: " + idCliente + ", Nombre: " + nombre + ", Direccion: " + direccion + ",Celular: " + celular + ", Email: " + email;
    }
}