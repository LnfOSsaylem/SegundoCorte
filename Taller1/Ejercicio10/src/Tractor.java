public class Tractor extends Vehiculo {
    private double precioDia;
    private String fechaRenta;
    private String fechaDevolucion;

    public Tractor() {
    }

    public Tractor(String placa, String tipoVehiculo, double precioDia, String fechaRenta) {
        super(placa, tipoVehiculo);
        this.precioDia = precioDia;
        this.fechaRenta = fechaRenta;
    }

    public Tractor(String placa, String tipoVehiculo, double precioDia, String fechaRenta, String fechaDevolucion) {
        super(placa, tipoVehiculo);
        this.precioDia = precioDia;
        this.fechaRenta = fechaRenta;
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getPrecioDia() {
        return this.precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public String getFechaRenta() {
        return this.fechaRenta;
    }

    public void setFechaRenta(String fechaRenta) {
        this.fechaRenta = fechaRenta;
    }

    public String getFechaDevolucion() {
        return this.fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPrecio por dia: " + getPrecioDia() + "\nFecha de renta: " + getFechaRenta()
                + "\nFecha de devolucion: " + getFechaDevolucion();
    }

    public boolean alquilado(String estado) {
        return super.alquilado(estado);
    }
}