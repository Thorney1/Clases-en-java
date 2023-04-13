public class Main {
    public static void main(String[] args) {
        LectorCliente lectorCliente = new LectorCliente();
        lectorCliente.lectorCliente(args);
        LectorProducto lectorProducto = new LectorProducto();
        lectorProducto.lectorProducto(args);
    }
}