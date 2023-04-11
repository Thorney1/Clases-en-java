public class Computador extends Productos {
    string cpu;
    int ram;
    int discoDuro;

    public Computador(int idProducto, string marca, int precio, string cpu, int ram, int discoDuro){
        super(idProducto, marca, precio);
        this.cpu = cpu;
        this.ram = ram;
        this.discoDuro = discoDuro;

    }
}
