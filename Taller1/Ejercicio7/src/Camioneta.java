public class Camioneta extends VehiculoTipoDos {
    public Camioneta(String serieMotor, String marca, int ano, double precio, double capCarga, int cantEjes,
            int cantRodadas) {
        super(serieMotor, marca, ano, precio, capCarga, cantEjes, cantRodadas);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de auto: Camioneta" + "\n-----------------------\n";
    }
}