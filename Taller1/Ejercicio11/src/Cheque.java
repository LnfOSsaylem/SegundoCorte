public class Cheque extends Cuenta {
    private double comUSOCHEQUERA;
    private double comSALDOINSUFICIENTE;

    public Cheque() {
    }

    public Cheque(int noCuenta, String nombreCliente, double saldo, double comUSOCHEQUERA,
            double comSALDOINSUFICIENTE) {
        super(noCuenta, nombreCliente, saldo);
        this.comUSOCHEQUERA = comUSOCHEQUERA;
        this.comSALDOINSUFICIENTE = comSALDOINSUFICIENTE;
    }

    public double getComUSOCHEQUERA() {
        return this.comUSOCHEQUERA;
    }

    public void setComUSOCHEQUERA(double comUSOCHEQUERA) {
        this.comUSOCHEQUERA = comUSOCHEQUERA;
    }

    public double getComSALDOINSUFICIENTE() {
        return this.comSALDOINSUFICIENTE;
    }

    public void setComSALDOINSUFICIENTE(double comSALDOINSUFICIENTE) {
        this.comSALDOINSUFICIENTE = comSALDOINSUFICIENTE;
    }

    @Override
    public String toString() {
        return super.toString() + "\nComision por uso de chequera: " + getComUSOCHEQUERA()
                + "\nComision por emision de cheques con saldo insuficiente: " + getComSALDOINSUFICIENTE();
    }

    public void saldoNUEVOCOMISION() {
        double saldo = super.getSaldo() * (this.comUSOCHEQUERA / 100);
        super.setSaldo(saldo);
    }

    public void saldoNUEVOEMISION(double cantidadEMITIDA){
        if(super.validarRetiro(cantidadEMITIDA)){

        }
        else{
            double saldocantidadEMITIDA-super.getSaldo();
        };

    }

}