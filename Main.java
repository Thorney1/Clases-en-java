import Models.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        LectorCliente lectorCliente = new LectorCliente();
        var clientes = lectorCliente.lectorCliente(args);
        LectorProducto lectorProducto = new LectorProducto();
        var productos = lectorProducto.lectorProducto(args);

        try {
            while (true) {
                Scanner scn = new Scanner(System.in);
                System.out.print("Por favor ingrese su rut: ");
                var rut = scn.nextLine();
                var existeClientes = clientes.stream().filter(x -> x.getRut().equals(rut)).count() > 0;
                if (existeClientes) {
                    List<Producto> productosSeleccionados = new ArrayList<Producto>();
                    while (true) {
                        System.out.println("Elija su opcion");
                        System.out.println("1.- Ver productos");
                        System.out.println("2.- Ingrese sus productos");
                        var action = scn.nextLine();

                        switch (action) {
                            case "1":
                                System.out.println("¿Que categoria desea ver?");
                                System.out.println("1.- Computadores");
                                System.out.println("2.- Monitor");
                                System.out.println("3.- Mouse");
                                String type = scn.nextLine();

                                List<Producto> filter = new ArrayList<Producto>();
                                if (type.equals("1")) {
                                    filter = productos.stream().filter(
                                            x ->
                                                    x.getCaracteristica1()!= null &&
                                                            x.getCaracteristica2()!= null &&
                                                            x.getCaracteristica3()!= null
                                    ).collect(Collectors.toList());

                                }
                                if (type.equals("2")) {
                                    filter = productos.stream().filter(
                                            x ->
                                                    x.getCaracteristica1()!= null &&
                                                            x.getCaracteristica2()== null &&
                                                            x.getCaracteristica3()== null
                                    ).collect(Collectors.toList());
                                }
                                if (type.equals("3")) {
                                    filter = productos.stream().filter(
                                            x ->
                                                    x.getCaracteristica1()== null &&
                                                            x.getCaracteristica2()== null &&
                                                            x.getCaracteristica3()== null
                                    ).collect(Collectors.toList());
                                }

                                for (int i = 0; i < filter.size(); i++) {
                                    System.out.println(filter.get(i).getIdProducto() + " " + filter.get(i).getMarca() + " " + filter.get(i).getPrecioUnitario()+" "+(Optional.ofNullable(filter.get(i).getCaracteristica1()).orElse(""))+" "+(Optional.ofNullable(filter.get(i).getCaracteristica2()).orElse(""))+" "+(Optional.ofNullable(filter.get(i).getCaracteristica3()).orElse("")));
                                }
                                break;
                            case "2":
                                System.out.println();
                                break;
                        }
                    }
                }
                System.out.println("El cliente no existe");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}