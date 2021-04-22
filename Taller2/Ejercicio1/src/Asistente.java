public class Asistente extends Empleado {
    final double pagoFijo = 4000;

    public Asistente() {
    }

    public double getLiquidacion() {
        return this.pagoFijo + (this.pagoFijo * super.getBonificacion() / 100);
    }
}