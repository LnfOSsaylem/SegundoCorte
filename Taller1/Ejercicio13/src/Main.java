import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char mas = 'S';
        while (mas == 'S') {
            String fabricante = "";
            int modelo = 0;
            int anoFabricacion = 0;
            double kilometraje = 0;
            int cantidadPasajeros = 0;
            CapacidadLimite c;
            System.out.println("Seleccione el vehiculo que desea crear: ");
            System.out.print("\n1) Motocicleta ");
            System.out.print("\n2) Automovil ");
            System.out.print("\n3) Camion ");
            System.out.print("\nOPCION: ");
            int opcion = input.nextInt();
            System.out.print("Digita el fabricante: ");
            fabricante = input.next();
            System.out.print("Digita el modelo: ");
            modelo = input.nextInt();
            System.out.print("Digita el año de fabricacion: ");
            anoFabricacion = input.nextInt();
            System.out.print("Digita el Kilometraje: ");
            kilometraje = input.nextDouble();
            switch (opcion) {
                case 1:
                    String uso;
                    System.out.print("\nDigita el uso de la motocicleta: ");
                    uso = input.next();
                    Motocicleta m = new Motocicleta(fabricante, modelo, anoFabricacion, kilometraje, uso);
                    break;
                case 2:
                    String estilo;
                    System.out.print("\nDigita el estilo del vehiculo: ");
                    estilo = input.next();
                    Automovil a = new Automovil(fabricante, modelo, anoFabricacion, kilometraje, estilo);
                    System.out.print("Digite el numero de pasajeros para el automovil: ");
                    cantidadPasajeros = input.nextInt();
                    c = new CapacidadLimite(a);
                    if (a.cumplirMEDIDAS(cantidadPasajeros, c) == true) {
                        System.out.println("\nEste vehiculo cumple con las medidas de seguridad");
                    } else {
                        System.out.println("\nEste vehiculo NO cumple con las medidas de seguridad");
                    }
                    break;
                case 3:
                    int cantidadRemolques;
                    System.out.print("Digita la cantidad de remolques: ");
                    cantidadRemolques = input.nextInt();
                    Camion camion = new Camion(fabricante, modelo, anoFabricacion, kilometraje, cantidadRemolques);
                    System.out.print("Digite el numero de pasajeros para el camion: ");
                    cantidadPasajeros = input.nextInt();
                    c = new CapacidadLimite(camion);
                    if (camion.cumplirMEDIDAS(cantidadPasajeros, c) == true) {
                        System.out.println("\nEste vehiculo cumple con las medidas de seguridad");
                    } else {
                        System.out.println("\nEste vehiculo NO cumple con las medidas de seguridad");
                    }
                    break;
                default:
                    System.out.print("Digita una opcion valida");
            }
            System.out.println("Desea seguir (S/N): ");
            mas = input.next().charAt(0);
        }
    }
}