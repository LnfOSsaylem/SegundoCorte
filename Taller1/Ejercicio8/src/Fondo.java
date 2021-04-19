public class Fondo {
    private int noFondo;
    private double saldoMensual;

    public Fondo() {
    }

    public Fondo(int noFondo, double saldoMensual) {
        this.noFondo = noFondo;
        this.saldoMensual = saldoMensual;
    }

    public int getNoFondo() {
        return this.noFondo;
    }

    public void setNoFondo(int noFondo) {
        this.noFondo = noFondo;
    }

    public double getSaldoMensual() {
        return this.saldoMensual;
    }

    public void setSaldoMensual(double saldoMensual) {
        this.saldoMensual = saldoMensual;
    }

}