public class Vehiculo {
    private String placa;
    private String tipoVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return this.tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String toString() {
        return "Placa: " + getPlaca() + "Tipo de vehiculo: " + getTipoVehiculo();
    }

    public boolean alquilado(String estado) {
        if (estado.equals("alquilado")) {
            return true;
        } else {
            return false;
        }
    }
}