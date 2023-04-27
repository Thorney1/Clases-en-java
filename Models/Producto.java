package Models;


public class Producto {
    int idProducto;
    String marca;
    int precioUnitario;
    String caracteristica1;
    String caracteristica2;
    String caracteristica3;

    public Producto(int idProducto, String marca, int precio, String Caracteristica1, String Caracteristica2, String Caracteristica3){
        this.idProducto = idProducto;
        this.marca = marca;
        this.precioUnitario = precio;
        this.caracteristica1= Caracteristica1;
        this.caracteristica2= Caracteristica2;
        this.caracteristica3= Caracteristica3;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setMarca(String marca){
        this.marca= marca;
    }

    public String getMarca(){
        return marca;
    }


    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCaracteristica1() {
        return caracteristica1;
    }

    public void setCaracteristica1(String caracteristica1) {
        caracteristica1 = caracteristica1;
    }

    public String getCaracteristica2() {
        return caracteristica2;
    }

    public void setCaracteristica2(String caracteristica2) {
        caracteristica2 = caracteristica2;
    }

    public String getCaracteristica3() {
        return caracteristica3;
    }

    public void setCaracteristica3(String caracteristica3) {
        caracteristica3 = caracteristica3;
    }

    @Override
    public String toString() {
        return "Models.Producto: " + idProducto + ", " + marca + ", " + precioUnitario;
    }
}

