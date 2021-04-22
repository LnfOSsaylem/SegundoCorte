public abstract class Empleado implements Trabajador {
    private final double bonificacion = 70;

    public Empleado() {
    }

    public double getBonificacion() {
        return this.bonificacion;
    }

    public abstract double getLiquidacion();
}