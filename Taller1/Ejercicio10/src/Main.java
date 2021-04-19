import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char mas = 'S';
        int counter = 1;
        int opcion;
        char opcion2;
        Vehiculo[] vehiculos = new Vehiculo[100];
        int cantidadVehiculos = 0;
        while (mas == 'S') {
            String placa;
            String tipoVehiculo;
            double precioPorKM;
            double cantidadKMrenta;
            double cantidadKMdevuelve;
            double precioDia;
            String dia;
            String mes;
            String ano;
            String fechaCompletaRenta;
            String fechaCompletaDevolucion;

            if (counter >= 2) {
                System.out.print("\nDigite la operacion que desea realizar");
                System.out.print("\n1) Rentar un vehiculo");
                System.out.print("\n2) Devolver un vehiculo");
                System.out.print("\n3) Salir");
                System.out.print("\nOpcion: ");
                opcion = input.nextInt();
                if (opcion == 1) {
                    System.out.println("Que tipo de vehiculo desea rentar? (Autobus: A / Tractor: T): ");
                    opcion2 = input.next().charAt(0);
                    if (opcion2 == 'A') {
                        System.out.println("\n///// Datos del vehiculo (AUTOBUS) /////");
                        System.out.print("Digite placa: ");
                        placa = input.next();
                        System.out.print("Digite tipo de vehiculo: ");
                        tipoVehiculo = input.next();
                        System.out.print("Digite precio por KM: ");
                        precioPorKM = input.nextDouble();
                        System.out.print("Digite cantidad KM de renta: ");
                        cantidadKMrenta = input.nextDouble();
                        Vehiculo a = new Autobus(placa, tipoVehiculo, precioPorKM, cantidadKMrenta);
                        a.alquilado("alquilado");
                        vehiculos[cantidadVehiculos] = a;
                        cantidadVehiculos++;
                        counter++;
                    } else {
                        System.out.println("\n///// Datos del vehiculo (TRACTOR) /////");
                        System.out.print("Digite placa: ");
                        placa = input.next();
                        System.out.print("Digite tipo de vehiculo: ");
                        tipoVehiculo = input.next();
                        System.out.print("Digite precio por dia: ");
                        precioDia = input.nextDouble();
                        System.out.print("Digite dia de la fecha de renta: ");
                        dia = input.next();
                        System.out.print("Digite mes de la fecha de renta: ");
                        mes = input.next();
                        System.out.print("Digite año de la fecha de renta: ");
                        ano = input.next();
                        fechaCompletaRenta = (ano + "-" + mes + "-" + dia);
                        Vehiculo t = new Tractor(placa, tipoVehiculo, precioDia, fechaCompletaRenta);
                        t.alquilado("alquilado");
                        vehiculos[cantidadVehiculos] = t;
                        cantidadVehiculos++;
                        counter++;
                    }
                } else if (opcion == 2) {
                    System.out.print("Digite placa del vehiculo a devolver: ");
                    String placaD = input.next();
                    int i = 0;
                    int pos = 0;
                    char encontrar = 'N';
                    while (encontrar == 'N' && i < cantidadVehiculos) {
                        if (placaD.equals(vehiculos[i].getPlaca())) {
                            encontrar = 'S';
                            pos = i;
                        } else {
                            i++;
                        }
                    }
                    if (encontrar == 'N') {
                        System.out.println("El vehiculo no se encontro en la lista");
                    } else {
                        if (vehiculos[pos] instanceof Tractor) {
                            Tractor t = (Tractor) vehiculos[pos]; // DownCasting
                            System.out.print("\n\nDigite el dia de entrega del vehiculo: ");
                            dia = input.next();
                            System.out.print("Digite el mes de entrega del vehiculo: ");
                            mes = input.next();
                            System.out.print("Digite el año de entrega del vehiculo: ");
                            ano = input.next();
                            fechaCompletaDevolucion = (ano + "-" + mes + "-" + dia);
                            t.setFechaDevolucion(fechaCompletaDevolucion);
                            LocalDate dBefore = LocalDate.parse(t.getFechaRenta(), DateTimeFormatter.ISO_LOCAL_DATE);
                            LocalDate dAfter = LocalDate.parse(t.getFechaDevolucion(),
                                    DateTimeFormatter.ISO_LOCAL_DATE);
                            long diff = ChronoUnit.DAYS.between(dBefore, dAfter);
                            double total = t.getPrecioDia() * diff;
                            System.out.printf("Total a pagar es: %.2f $", total);
                            t.alquilado("Disponible");
                        } else {
                            Autobus a = (Autobus) vehiculos[pos]; // DOWNCASTING
                            System.out.print("\nDigite la cantidad de KM del vehiculo devuelto: ");
                            a.setCantidadKMdevuelve(input.nextDouble());
                            double resta = a.getCantidadKMdevuelve() - a.getCantidadKMrenta();
                            double total = a.getPrecioPorKM() * resta;
                            System.out.printf("Total a pagar es: %.2f $", total);
                            a.alquilado("Disponible");
                        }
                    }

                } else {
                    mas = 'N';
                }
            } else {
                System.out.print("\nDigite la opcion que desea realizar");
                System.out.print("\n1) Rentar un vehiculo");
                System.out.print("\n2) Salir");
                System.out.print("\nOpcion: ");
                opcion = input.nextInt();
                if (opcion == 1) {
                    System.out.println("Que tipo de vehiculo desea rentar? (Autobus: A / Tractor: T): ");
                    opcion2 = input.next().charAt(0);
                    if (opcion2 == 'A') {
                        System.out.println("\n///// Datos del vehiculo (AUTOBUS) /////");
                        System.out.print("Digite placa: ");
                        placa = input.next();
                        System.out.print("Digite tipo de vehiculo: ");
                        tipoVehiculo = input.next();
                        System.out.print("Digite precio por KM: ");
                        precioPorKM = input.nextDouble();
                        System.out.print("Digite cantidad KM de renta: ");
                        cantidadKMrenta = input.nextDouble();
                        Autobus a = new Autobus(placa, tipoVehiculo, precioPorKM, cantidadKMrenta);
                        a.alquilado("alquilado");
                        vehiculos[cantidadVehiculos] = a;
                        cantidadVehiculos++;
                        counter++;
                    } else {
                        System.out.println("\n///// Datos del vehiculo (TRACTOR) /////");
                        System.out.print("Digite placa: ");
                        placa = input.next();
                        System.out.print("Digite tipo de vehiculo: ");
                        tipoVehiculo = input.next();
                        System.out.print("Digite precio por dia: ");
                        precioDia = input.nextDouble();
                        System.out.print("Digite dia de la fecha de renta: ");
                        dia = input.next();
                        System.out.print("Digite mes de la fecha de renta: ");
                        mes = input.next();
                        System.out.print("Digite año de la fecha de renta: ");
                        ano = input.next();
                        fechaCompletaRenta = (ano + "-" + mes + "-" + dia);
                        Tractor t = new Tractor(placa, tipoVehiculo, precioDia, fechaCompletaRenta);
                        t.alquilado("alquilado");
                        vehiculos[cantidadVehiculos] = t;
                        cantidadVehiculos++;
                        counter++;
                    }
                } else {
                    mas = 'N';
                }
            }
            System.out.print("\nDesea volver al menu? (S: Si/ N: No): ");
            mas = input.next().charAt(0);

        }

    }
}