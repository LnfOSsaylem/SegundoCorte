public class Cliente {
    private String nif;
    private int noCuenta;
    private double saldo;

    public Cliente() {
    }

    public Cliente(String nif, int noCuenta, double saldo) {
        this.nif = nif;
        this.noCuenta = noCuenta;
        this.saldo = saldo;
    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getNoCuenta() {
        return this.noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "\nNIF: " + getNif() + "\nNo. de Cuenta: " + getNoCuenta() + "\nSaldo: " + getSaldo();
    }

}