public class Vagoneta extends VehiculoTipoUno {
    public Vagoneta(String serieMotor, String marca, int ano, double precio, int cP) {
        super(serieMotor, marca, ano, precio, cP);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de auto: Vagoneta" + "\n-----------------------\n";
    }
}