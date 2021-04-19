import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ahorro extends Cuenta {
    private String fechaVencimiento;
    private double interesMensual;

    public Ahorro() {
    }

    public Ahorro(int noCuenta, String nombreCliente, double saldo, String fechaVencimiento, double interesMensual) {
        super(noCuenta, nombreCliente, saldo);
        this.fechaVencimiento = fechaVencimiento;
        this.interesMensual = interesMensual;
    }

    public String getFechaVencimiento() {
        return this.fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getInteresMensual() {
        return this.interesMensual;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFecha de vencimiento: " + getFechaVencimiento() + "\nInteres mensual: "
                + getInteresMensual();
    }

    public void depositarIntereses() {
        double intereses = super.getSaldo() * (this.interesMensual / 100);
        double nuevoSaldo = super.getSaldo() + intereses;
        super.setSaldo(nuevoSaldo);
    }

    public boolean validarPrimero(int mes) {
        if (mes == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarRetiroFECHAVENCIMIENTO(String dia, String mes, String ano) {
        LocalDate dBefore = LocalDate.parse(getFechaVencimiento(), DateTimeFormatter.ISO_LOCAL_DATE);
        String fechaA = ano + "-" + mes + "-" + dia;
        LocalDate dAfter = LocalDate.parse(fechaA, DateTimeFormatter.ISO_LOCAL_DATE);
        long diff = ChronoUnit.DAYS.between(dBefore, dAfter);
        if (diff == 0) {
            return true;
        } else {
            return false;
        }
    }
}