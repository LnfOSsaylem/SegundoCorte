public class EmpleadoComision extends Empleado {
    private double tVentas, pVentas;

    public EmpleadoComision() {
        super();
        this.pVentas = 0.0;
        this.tVentas = 0.0;
    }

    public EmpleadoComision(String nombre, double tVentas, double pVentas) {
        super(nombre);
        this.tVentas = tVentas;
        this.pVentas = pVentas;
    }

    public double getTVentas() {
        return this.tVentas;
    }

    public void setTVentas(double tVentas) {
        this.tVentas = tVentas;
    }

    public double getPVentas() {
        return this.pVentas;
    }

    public void setPVentas(double pVentas) {
        this.pVentas = pVentas;
    }

    @Override
    public double getSalario() {
        return this.tVentas * (this.pVentas / 100);
    }
}