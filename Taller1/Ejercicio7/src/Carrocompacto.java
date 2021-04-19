public class Carrocompacto extends VehiculoTipoUno {
    public Carrocompacto(String serieMotor, String marca, int ano, double precio, int cP) {
        super(serieMotor, marca, ano, precio, cP);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de auto: Carro Compacto" + "\n-----------------------\n";
    }
}