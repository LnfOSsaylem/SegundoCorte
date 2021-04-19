public class Main {
    public static void main(String[] args) {
        int nel = 0;
        Vehiculo[] list = new Vehiculo[100];
        Vehiculo v1 = new Carrocompacto("AA-2929", "Mazda Vitula", 2019, 54000, 7);
        nel++;
        Vehiculo v2 = new Carrodelujo("BBB-89928", "Ferrari", 2021, 99999999, 2);
        nel++;
        Vehiculo v3 = new Vagoneta("KKCKLO-27892", "Toyota", 1987, 877754, 12);
        nel++;
        Vehiculo v4 = new Camioneta("BCVW-1234", "Toyota", 2013, 35000, 300, 23, 21);
        nel++;
        list[0] = v1;
        list[1] = v2;
        list[2] = v3;
        list[3] = v4;
        mostrarVehiculos(list, nel);
    }

    public static void mostrarVehiculos(Vehiculo[] list, int nel) {
        System.out.println("\n//// COMPRA DE VEHICULOS ////");
        for (int i = 0; i < nel; i++) {
            System.out.print(list[i].toString());
        }
    }
}