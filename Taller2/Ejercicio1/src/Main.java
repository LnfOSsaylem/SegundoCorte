public class Main {
    public static void main(String[] args) {
        Trabajador[] trabajadores = new Trabajador[4];
        Empleado e1 = new Coordinador();
        trabajadores[0] = e1;
        Empleado e2 = new Asistente();
        trabajadores[1] = e2;
        Empleado e3 = new Secretaria();
        trabajadores[2] = e3;
        Docente e4 = new Docente(95);
        trabajadores[3] = e4;
        imprimirLiquidacion(trabajadores);
    }

    public static void imprimirLiquidacion(Trabajador[] trabajadores) {
        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i] instanceof Empleado) {
                System.out.print("\nLiquidacion de Empleado: " + trabajadores[i].getLiquidacion());
            } else {
                System.out.print("\nLiquidacion docentes: " + trabajadores[i].getLiquidacion());
            }

        }
    }
}