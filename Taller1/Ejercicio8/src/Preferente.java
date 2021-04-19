public class Preferente extends Cliente {
    private Fondo[] fondos = new Fondo[100];
    private int cantidadFondos;

    public Preferente() {
    }

    public Preferente(Fondo[] fondos, String nif, int noCuenta, double saldo, int cantidadFondos) {
        super(nif, noCuenta, saldo);
        this.fondos = fondos;
        this.cantidadFondos = cantidadFondos;
    }

    public Fondo[] getFondos() {
        return this.fondos;
    }

    public void setFondos(Fondo[] fondos) {
        this.fondos = fondos;
    }

    public int getCantidadFondos() {
        return this.cantidadFondos;
    }

    public void setCantidadFondos(int cantidadFondos) {
        this.cantidadFondos = cantidadFondos;
    }

}