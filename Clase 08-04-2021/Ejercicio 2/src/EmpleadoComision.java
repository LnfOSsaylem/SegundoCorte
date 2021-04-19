public class EmpleadoComision extends Empleado {
    private double comisionVentas;

    public EmpleadoComision() {
    }

    public EmpleadoComision(int nHorasTrabajadas, double comisionVentas, double pagoHora) {
        super(nHorasTrabajadas, pagoHora);
        this.comisionVentas = comisionVentas;
    }

    public double getComisionVentas() {
        return this.comisionVentas;
    }

    public void setComisionVentas(double comisionVentas) {
        this.comisionVentas = comisionVentas;
    }

    public double getSueldo() {
        double sueldonuevo = 0;
        sueldonuevo = super.getSueldo() + this.comisionVentas;
        return sueldonuevo;
    }

}
