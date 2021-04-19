import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        char mas, mas2;
        mas = 'S';
        mas2 = 'S';
        int f, cantidadFondos = 0, cantidadClientes = 0;
        String nif;
        int noCuenta;
        double saldo;
        int noFondo;
        double saldoFondo;
        Fondo[] fondos = new Fondo[100];
        Cliente[] clientes = new Cliente[100];
        do {
            cantidadFondos = 0;
            System.out.println("\n--------- BANCO 001 ---------\n");
            System.out.println("\nElija tipo de cliente que desea crear");
            System.out.print("\n1.Cliente Común");
            System.out.print("\n2.Cliente Especial (Preferente)");
            System.out.print("\nOpcion: ");
            f = input.nextInt();
            switch (f) {
                case 1:
                    System.out.print("\nDigite el NIF para el cliente: ");
                    nif = input.next();
                    System.out.print("\nDigite el No. de Cuenta para el cliente: ");
                    noCuenta = input.nextInt();
                    System.out.print("\nDigite el saldo del cliente: ");
                    saldo = input.nextDouble();
                    clientes[cantidadClientes] = new Clientecomun(nif, noCuenta, saldo);
                    cantidadClientes++;
                    break;
                case 2:
                    System.out.print("\nDigite el NIF para el cliente: ");
                    nif = input.next();
                    System.out.print("\nDigite el No. de Cuenta para el cliente: ");
                    noCuenta = input.nextInt();
                    System.out.print("\nDigite el saldo del cliente: ");
                    saldo = input.nextDouble();
                    while (mas2 == 'S') {
                        System.out.print("\nDatos para el " + (cantidadFondos + 1) + " Fondo del cliente");
                        System.out.print("\nDigite el No. de Fondo:");
                        noFondo = input.nextInt();
                        System.out.print("\nDigite el Saldo mensual: ");
                        saldoFondo = input.nextDouble();
                        fondos[cantidadFondos] = new Fondo(noFondo, saldoFondo);
                        cantidadFondos++;
                        System.out.print("\nDesea agregar otro fondo? (S/N): ");
                        mas2 = input.next().charAt(0);
                    }
                    clientes[cantidadClientes] = new Preferente(fondos, nif, noCuenta, saldo, cantidadFondos);
                    cantidadClientes++;
                    break;
                default:
                    System.out.println("Escribe un valor válido");
            }
            System.out.print("\n\n¿Agregar otro cliente? (S/N): ");
            mas = input.next().charAt(0);
        } while (mas == 'S');
        consulta(clientes, cantidadClientes);
    }

    public static void consulta(Cliente[] clientes, int cantidadClientes) {
        Scanner input = new Scanner(System.in);
        int opcion;
        System.out.println("/// CONSULTAS /// ");
        System.out.println("1) Ver todo el registro de clientes");
        System.out.println("2) Buscar un cliente en especifico (Necesita No. de cuenta)");
        System.out.print("Opcion: ");
        opcion = input.nextInt();
        switch (opcion) {
            case 1:
                for (int i = 0; i < cantidadClientes; i++) {
                    if (clientes[i] instanceof Preferente) {
                        System.out.println("Cliente " + (i + 1));
                        System.out.println("Tipo: preferente");
                    } else {
                        System.out.println("Cliente " + (i + 1));
                        System.out.println("Tipo: comun");
                    }
                }
                System.out.print("\nDigite el cliente que desea consultar (1,2,3...etc): ");
                int noCliente = input.nextInt();
                // Ya que el array comienza en cero
                noCliente = noCliente - 1;
                int i = 0;
                if (clientes[noCliente] instanceof Preferente) {
                    System.out.print("\nTipo: preferente");
                    Preferente preferente = (Preferente) clientes[noCliente];
                    System.out.print("\nNo. de cuenta: " + preferente.getNoCuenta());
                    System.out.print("\nNIF: " + preferente.getNif());
                    System.out.printf("\nSaldo: %.2f $", preferente.getSaldo());
                    System.out.println("\nCantidad de fondos: " + preferente.getCantidadFondos());
                    for (int j = 0; j < preferente.getCantidadFondos(); j++) {
                        System.out.print("\n/// Fondos ///");
                        System.out.print("\nFondo " + (j + 1));
                        System.out.print("\nNo. de fondo: " + preferente.getFondos()[j].getNoFondo());
                        System.out.printf("\nSaldo de fondo: %.2f $", preferente.getFondos()[j].getSaldoMensual());
                    }
                } else if (clientes[noCliente] instanceof Clientecomun) {
                    System.out.print("\nTipo: comun");
                    System.out.print("\nNo. de cuenta: " + clientes[noCliente].getNoCuenta());
                    System.out.print("\nNIF: " + clientes[noCliente].getNif());
                    System.out.printf("\nSaldo: %.2f $", clientes[noCliente].getSaldo());
                } else {
                    System.out.println("\n\nEstas buscando un cliente que no está registrado\n\n");
                }
                break;

            case 2:
                int buscador = 0;
                char consultarMAS = 'S';

                // TIPO DE CONSULTA 2: CUANDO SE CONOCE NO DE CUENTA Y NO DE FONDO ESPECIFICOS
                System.out.println("Digite el No. de cuenta que desea consultar: ");
                int noCuenta = input.nextInt();
                // RECORREMOS EL ARRAY PARA ENCONTRAR LA CUENTA, SI NO ESTA, AUMENTA BUSCADOR Y
                // AL FINAL,
                // SI TIENE EL MISMO VALOR QUE LA CANTIDAD DE ELEMENTOS EN EL VECTOR, SIGNIFICA
                // QUE NO ESTA
                // EN EL ARRAY.
                for (int r = 0; r < cantidadClientes; r++) {
                    if (clientes[r].getNoCuenta() == noCuenta) {
                        while (consultarMAS == 'S') {
                            System.out.println("Seleccione la informacion que desea consultar");
                            System.out.println("1. NIF");
                            System.out.println("2. Tipo de Cliente");
                            System.out.println("3. Saldo");
                            System.out.println("Opcion: ");
                            int opcion2 = input.nextInt();
                            if (opcion2 == 1) {
                                System.out.print("\nNIF : " + clientes[r].getNif());
                            } else if (opcion2 == 2) {
                                if (clientes[r] instanceof Preferente) {
                                    System.out.print("Tipo de cuenta:  Cliente Preferente");
                                    System.out.println("\nOpciones:");
                                    System.out.println("1) Consultar Fondos");
                                    System.out.println("2) Volver");
                                    System.out.print("\nOpcion: ");
                                    int consulta = input.nextInt();
                                    if (consulta == 1) {
                                        char consultar = 'S';
                                        Preferente pref = (Preferente) clientes[r]; // DOWNCASTING
                                        while (consultar == 'S') {
                                            System.out.println("\nDigite el No. de fondo a consultar");
                                            int nodefondo = input.nextInt();
                                            char encontrar = 'N';
                                            int recorrerFondos = 0;
                                            while (encontrar == 'N' && recorrerFondos < pref.getCantidadFondos()) {
                                                if (nodefondo == pref.getFondos()[recorrerFondos].getNoFondo()) {
                                                    System.out.println("Saldo del fondo: "
                                                            + pref.getFondos()[recorrerFondos].getSaldoMensual());
                                                    encontrar = 'S';
                                                } else {
                                                    recorrerFondos++;
                                                }
                                            }
                                            if (encontrar != 'S') {
                                                System.out.println("/// FONDO NO ENCONTRADO ///");
                                            }
                                            System.out.println("¿ Desea consultar otro fondo ? (S/N) : ");
                                            consultar = input.next().charAt(0);
                                        }
                                    }
                                } else {
                                    System.out.print("Cliente Comun");
                                }
                            } else {
                                System.out.print("Saldo: " + clientes[r].getSaldo());
                            }
                            System.out.println("\nDesea seguir consultando? (S/N): ");
                            consultarMAS = input.next().charAt(0);
                        }
                    } else {
                        buscador++;
                    }
                }
                if (buscador == cantidadClientes) {
                    System.out.println("El No. de cuenta que buscaba no esta registrado");
                }
                break;
            default:
                System.out.println("Digita una opcion valida");
        }
    }
}