public class Motocicleta extends VehiculoMotorizado {
    private String uso;

    public Motocicleta() {
    }

    public Motocicleta(String fabricante, int modelo, int anoFabricacion, double kilometraje, String uso) {
        super(fabricante, modelo, anoFabricacion, kilometraje);
        this.uso = uso;
    }

    public String getUso() {
        return this.uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

}