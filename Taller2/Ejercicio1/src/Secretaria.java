public class Secretaria extends Empleado {
    private final double pagoFijo = 3000;

    public Secretaria() {
    }

    public double getLiquidacion() {
        return this.pagoFijo + (this.pagoFijo * super.getBonificacion() / 100);
    }
}