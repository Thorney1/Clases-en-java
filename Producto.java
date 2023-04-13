public class Producto {
    int idProducto;
    String marca;
    int precio;

    public Producto(int idProducto, String marca, int precio){
        this.idProducto = idProducto;
        this.marca = marca;
        this.precio = precio;
    }

    public void setidProducto(int idProducto){
        this.idProducto= idProducto;
    }
    public int getidProducto(){
        return idProducto;
    }

    public void setMarca(String marca){
        this.marca= marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public int getPrecio(){
        return precio;
    }

    @Override
    public String toString() {
        return "Producto: " + idProducto + ", " + marca + ", " + precio;
    }
}

