import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char mas;
        final Scanner input = new Scanner(System.in);
        mas = 'S';
        int nel = 0;
        int f = 0;
        final Empleado[] list = new Empleado[100];
        do {
            System.out.print("\n--- Seleccione el tipo de empleado ---- ");
            System.out.print("\n1.Empleado Asalariado");
            System.out.print("\n2.Empleado por Hora");
            System.out.print("\n3.Empleado por Comision");
            System.out.println("\n4.Empleado Asalariado por Comision");
            System.out.print("\nNumero: ");
            f = input.nextInt();
            String nombre;
            double pagoSemanal;
            double pagoHoraE;
            double pagoHora;
            int nHoras;
            double tVentas;
            double pVentas;
            double pagoBase;
            switch (f) {
                case 1:
                    System.out.print("\nDigite el nombre: ");
                    nombre = input.next();
                    System.out.print("\nDigite el pago semanal fijo: ");
                    pagoSemanal = input.nextDouble();
                    final Empleado e1 = new EmpleadoAsalariado(nombre, pagoSemanal);
                    list[nel] = e1;
                    nel++;
                    break;
                case 2:
                    System.out.print("\nDigite el nombre: ");
                    nombre = input.next();
                    System.out.print("\nDigite las horas trabajadas: ");
                    nHoras = input.nextInt();
                    System.out.print("\nDigite el pago por hora: ");
                    pagoHora = input.nextDouble();
                    System.out.print("\nDigite el pago por hora extra: ");
                    pagoHoraE = input.nextDouble();
                    final Empleado e2 = new EmpleadoHora(nombre, nHoras, pagoHora, pagoHoraE);
                    list[nel] = e2;
                    nel++;
                    break;
                case 3:
                    System.out.print("\nDigite el nombre: ");
                    nombre = input.next();
                    System.out.print("\nDigite el total de ventas: ");
                    tVentas = input.nextDouble();
                    System.out.print("\nDigite el porcentaje de comision: ");
                    pVentas = input.nextDouble();
                    final Empleado e3 = new EmpleadoComision(nombre, tVentas, pVentas);
                    list[nel] = e3;
                    nel++;
                    break;
                case 4:
                    System.out.print("\nDigite el nombre: ");
                    nombre = input.next();
                    System.out.print("\nDigite el pago base: ");
                    pagoBase = input.nextDouble();
                    System.out.print("\nDigite el total de ventas: ");
                    tVentas = input.nextDouble();
                    System.out.print("\nDigite el porcentaje de comision: ");
                    pVentas = input.nextDouble();
                    final Empleado e4 = new EmpleadoAsalariadoComision(nombre, tVentas, pVentas, pagoBase);
                    list[nel] = e4;
                    nel++;
                    break;
                default:
                    System.out.println("Digita un valor válido");
            }
            System.out.print("\n\nDesea agregar un nuevo empleado? (S/N): ");
            mas = input.next().charAt(0);
        } while (mas == 'S');
        mostrarNomina(list, nel);

    }

    public static void mostrarNomina(Empleado[] list, int nel) {
        double totalNomina = 0;
        double totalAsalariado = 0;
        double totalHoras = 0;
        double totalComision = 0;
        double totalAsalariadoComision = 0;

        for (int i = 0; i < nel; i++) {
            totalNomina += list[i].getSalario();
            if (list[i] instanceof EmpleadoAsalariado) {
                totalAsalariado += list[i].getSalario();
            } else if (list[i] instanceof EmpleadoHora) {
                totalHoras += list[i].getSalario();
            } else if (list[i] instanceof EmpleadoAsalariadoComision) {
                totalAsalariadoComision += list[i].getSalario();
            } else {
                totalComision += list[i].getSalario();
            }
            System.out.print("\n-----------------------------------\n");
            mostrarLiquidacion(list[i]);
        }
        System.out.println("-----------------------------------");
        System.out.printf("\nNomina asalariado: %.2f $", totalAsalariado);
        System.out.printf("\nNomina por hora: %.2f $", totalHoras);
        System.out.printf("\nNomina por comision: %.2f $", totalComision);
        System.out.printf("\nNomina asalariado por comision: %.2f $", totalAsalariadoComision);
        System.out.println("\n-----------------------------------\n");
        System.out.printf("\nNomina Total: %.2f $", totalNomina);
    }

    public static void mostrarLiquidacion(Empleado e) {
        System.out.println("\nNombre: " + e.getNombre() + "\nLiquidacion = " + e.getSalario());
    }
}