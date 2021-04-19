public class Autobus extends Vehiculo {
    private double precioPorKM;
    private double cantidadKMrenta;
    private double cantidadKMdevuelve;

    public Autobus() {
    }

    public Autobus(String placa, String tipoVehiculo, double precioPorKM, double cantidadKMrenta) {
        super(placa, tipoVehiculo);
        this.precioPorKM = precioPorKM;
        this.cantidadKMrenta = cantidadKMrenta;
    }

    public Autobus(String placa, String tipoVehiculo, double precioPorKM, double cantidadKMrenta,
            double cantidadKMdevuelve) {
        super(placa, tipoVehiculo);
        this.precioPorKM = precioPorKM;
        this.cantidadKMrenta = cantidadKMrenta;
        this.cantidadKMdevuelve = cantidadKMdevuelve;
    }

    public double getPrecioPorKM() {
        return this.precioPorKM;
    }

    public void setPrecioPorKM(double precioPorKM) {
        this.precioPorKM = precioPorKM;
    }

    public double getCantidadKMrenta() {
        return this.cantidadKMrenta;
    }

    public void setCantidadKMrenta(double cantidadKMrenta) {
        this.cantidadKMrenta = cantidadKMrenta;
    }

    public double getCantidadKMdevuelve() {
        return this.cantidadKMdevuelve;
    }

    public void setCantidadKMdevuelve(double cantidadKMdevuelve) {
        this.cantidadKMdevuelve = cantidadKMdevuelve;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPrecio porKM: " + getPrecioPorKM() + "\nCantidad de KM al rentar el vehiculo: "
                + getCantidadKMrenta() + "\nCantidad KM despues de la renta: " + getCantidadKMdevuelve();
    }

    public boolean alquilado(String estado) {
        return super.alquilado(estado);
    }

}