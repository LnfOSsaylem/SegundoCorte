public class Camion extends VehiculoMotorizado {
    private int cantidadRemolques;

    public Camion() {
    }

    public Camion(String fabricante, int modelo, int anoFabricacion, double kilometraje, int cantidadRemolques) {
        super(fabricante, modelo, anoFabricacion, kilometraje);
        this.cantidadRemolques = cantidadRemolques;
    }

    public int getCantidadRemolques() {
        return this.cantidadRemolques;
    }

    public void setCantidadRemolques(int cantidadRemolques) {
        this.cantidadRemolques = cantidadRemolques;
    }

    public boolean cumplirMEDIDAS(int cantidadPasajeros, CapacidadLimite c) {
        if (cantidadPasajeros > c.getLimitePASAJEROSCAMIONES()) {
            return false;
        } else {
            return true;
        }
    }
}