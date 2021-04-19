public class Main {
    public static void main(String[] args) {
        Empleado[] listEmpleado = new Empleado[4];

        // UPCASTING: VER UN OBJETO ESPECIFICO DE FORMA GENERAL, GENERICA
        // DOWNCASTING:
        Empleado empleado = new EmpleadoAsalariado(200); // UPCASTING: LLENDO A FORMA MAS GENERAL
        listEmpleado[0] = empleado;
        Empleado empleado2 = new EmpleadoPorHora(10, 5, 300);
        listEmpleado[1] = empleado2;
        Empleado empleado3 = new EmpleadoComision(20, 10000);
        ImprimirNomina(listEmpleado);
        Imprimirresultados(empleado);
        Imprimirresultados(empleado2);
        Imprimirresultados(empleado3);

    }

    // METODO POLIMORFICO, NO NECESITA CONOCER EL TIPO DE EMPLEADO QUE LE PASO
    public static void Imprimirresultados(Empleado c) {
        System.out.println("Liquidacion: " + c.getLiquidacion());
    }

    // NUEVO METODO FUNCIONAL
    public static void ImprimirNomina(Empleado[] l) {
        double totalNomina = 0;
        int n = 1;
        // For edge, para cualquier empleado en la lista se guarda el empleado en la
        // variable e
        for (Empleado e : l) {
            totalNomina += e.getLiquidacion();
            System.out.println("\nLiquidacion Empleado " + n + " : " + e.getLiquidacion());
            n++;
        }
        System.out.println("\nTotal por concepto de nomina: " + totalNomina);
    }
}