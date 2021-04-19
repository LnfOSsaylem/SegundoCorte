public class Cuenta {
    private int noCuenta;
    private String nombreCliente;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(int noCuenta, String nombreCliente, double saldo) {
        this.noCuenta = noCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    public int getNoCuenta() {
        return this.noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "\nNumero de cuenta: " + getNoCuenta() + "\nNombre de cliente: " + getNombreCliente() + "\nSaldo: "
                + getSaldo();
    }

    public void retirar(double cantidadRetirar) {
        double retiro = cantidadRetirar;
        double nuevoSaldo = getSaldo() - cantidadRetirar;
        setSaldo(nuevoSaldo);
        System.out.print("--- Retiro exitoso ---");
        System.out.printf("\nRetiraste: %.2f", retiro);
        System.out.printf("\nTu nuevo saldo es: %.2f", getSaldo());
    }

    public boolean validarRetiro(double cantidadRetirar) {
        if (cantidadRetirar > getSaldo()) {
            return false;
        } else {
            return true;
        }
    }

    public double depositar(double cantidadDepositar) {
        double nuevoSaldo = (getSaldo() + cantidadDepositar);
        setSaldo(nuevoSaldo);
        return getSaldo();
    }

}