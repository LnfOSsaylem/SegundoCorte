public class VehiculoTipoUno extends Vehiculo {
    private int cantidadPasajeros;

    public VehiculoTipoUno(String serieMotor, String marca, int ano, double precio, int cP) {
        super(serieMotor, marca, ano, precio);
        this.cantidadPasajeros = cP;
    }

    public int getCantidadPasajeros() {
        return this.cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCantidad de pasajeros: " + getCantidadPasajeros();
    }

}