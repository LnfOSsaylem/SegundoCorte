public class EmpleadoAsalariadoComision extends EmpleadoComision {
    private double salarioBase;

    public EmpleadoAsalariadoComision() {
        super();
    }

    public EmpleadoAsalariadoComision(String nombre, double tVentas, double pVentas, double salarioBase) {
        super(nombre, tVentas, pVentas);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + this.salarioBase;
    }

}