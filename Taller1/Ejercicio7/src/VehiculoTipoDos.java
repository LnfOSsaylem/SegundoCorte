public class VehiculoTipoDos extends Vehiculo {
    private double capCarga;
    private int cantEjes;
    private int cantRodadas;

    public VehiculoTipoDos(String serieMotor, String marca, int ano, double precio, double capCarga, int cantEjes,
            int cantRodadas) {
        super(serieMotor, marca, ano, precio);
        this.capCarga = capCarga;
        this.cantEjes = cantEjes;
        this.cantRodadas = cantRodadas;
    }

    public double getCapCarga() {
        return this.capCarga;
    }

    public void setCapCarga(double capCarga) {
        this.capCarga = capCarga;
    }

    public int getCantEjes() {
        return this.cantEjes;
    }

    public void setCantEjes(int cantEjes) {
        this.cantEjes = cantEjes;
    }

    public int getCantRodadas() {
        return this.cantRodadas;
    }

    public void setCantRodadas(int cantRodadas) {
        this.cantRodadas = cantRodadas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCapacidad de carga" + getCapCarga() + "\nCantidad de ejes: " + getCantEjes()
                + "\nCantidad de rodadas: " + getCantRodadas();
    }
}