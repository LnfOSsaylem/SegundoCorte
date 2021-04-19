public class VehiculoMotorizado {
    private String fabricante;
    private int modelo;
    private int anoFabricacion;
    private double kilometraje;

    public VehiculoMotorizado() {
    }

    public VehiculoMotorizado(String fabricante, int modelo, int anoFabricacion, double kilometraje) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
        this.kilometraje = kilometraje;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getModelo() {
        return this.modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacion() {
        return this.anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public double getKilometraje() {
        return this.kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public VehiculoMotorizado fabricante(String fabricante) {
        setFabricante(fabricante);
        return this;
    }

    public String toString() {
        return "\nFabricante: " + getFabricante() + "\nModelo: " + getModelo() + "\nAño de Fabricacion: "
                + getAnoFabricacion() + "\nKilometraje: " + getKilometraje();
    }

}