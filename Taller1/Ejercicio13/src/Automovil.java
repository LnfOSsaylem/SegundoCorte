public class Automovil extends VehiculoMotorizado {
    private String estilo;

    public Automovil() {
    }

    public Automovil(String fabricante, int modelo, int anoFabricacion, double kilometraje, String estilo) {
        super(fabricante, modelo, anoFabricacion, kilometraje);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return this.estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEstilo: " + getEstilo();
    }

    public boolean cumplirMEDIDAS(int cantidadPasajeros, CapacidadLimite c) {
        if (cantidadPasajeros >= c.getLimitePASAJEROSAUTOS()) {
            return false;
        } else {
            return true;
        }
    }
}