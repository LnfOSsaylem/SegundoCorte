public class EmpleadoComision extends Empleado {
    private double pComision, totalpVentas;

    public EmpleadoComision() {
    }

    public EmpleadoComision(double pComision, double totalpVentas) {
        this.pComision = pComision;
        this.totalpVentas = totalpVentas;
    }

    public double getPComision() {
        return this.pComision;
    }

    public void setPComision(double pComision) {
        this.pComision = pComision;
    }

    public double getTotalpVentas() {
        return this.totalpVentas;
    }

    public void setTotalpVentas(double totalpVentas) {
        this.totalpVentas = totalpVentas;
    }

    @Override
    public double getLiquidacion() {
        return this.pComision * this.totalpVentas;
    }

}