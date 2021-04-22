public class Coordinador extends Empleado {
    private final double pagoFijo = 5000;

    public Coordinador() {
    }

    public double getLiquidacion() {
        return this.pagoFijo + (this.pagoFijo * super.getBonificacion() / 100);
    }
}