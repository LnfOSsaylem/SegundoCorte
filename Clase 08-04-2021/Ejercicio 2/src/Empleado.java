public class Empleado {
    private int nHorasTrabajadas;
    private double pagoHora;

    public Empleado() {
        this(190, 20000);
    }

    public Empleado(int nHorasTrabajadas, double pagoHora) {
        this.nHorasTrabajadas = nHorasTrabajadas;
        this.pagoHora = pagoHora;
    }

    public int getNHorasTrabajadas() {
        return this.nHorasTrabajadas;
    }

    public void setNHorasTrabajadas(int nHorasTrabajadas) {
        this.nHorasTrabajadas = nHorasTrabajadas;
    }

    public double getPagoHora() {
        return this.pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public double getSueldo() {
        double sueldo = 0;
        sueldo = (this.nHorasTrabajadas * this.pagoHora);
        return sueldo;
    }
}