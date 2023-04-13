public class Computador extends Productos {
    String cpu;
    int ram;
    int discoDuro;

    public Computador(int idProducto, String marca, int precio, String cpu, int ram, int discoDuro){
        super(idProducto, marca, precio);
        this.cpu = cpu;
        this.ram = ram;
        this.discoDuro = discoDuro;

    }
}
