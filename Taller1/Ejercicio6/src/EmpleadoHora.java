public class EmpleadoHora extends Empleado {
    private int nHoras;
    private double pHora, pHorae;

    public EmpleadoHora() {
        super();
        this.nHoras = 0;
        this.pHora = 0.0;
        this.pHorae = 0.0;

    }

    public EmpleadoHora(String nombre, int nHoras, double pHora, double pHorae) {
        super(nombre);
        this.nHoras = nHoras;
        this.pHora = pHora;
        this.pHorae = pHorae;
    }

    public int getNHoras() {
        return this.nHoras;
    }

    public void setNHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    public double getPHora() {
        return this.pHora;
    }

    public void setPHora(double pHora) {
        this.pHora = pHora;
    }

    public double getPHorae() {
        return this.pHorae;
    }

    public void setPHorae(double pHorae) {
        this.pHorae = pHorae;
    }

    @Override
    public double getSalario() {
        int nHorasE = 0;
        if (nHoras > 40) {
            nHorasE = this.nHoras - 40;
        }
        return (this.pHora * (this.nHoras - nHorasE)) + (this.pHorae * nHorasE);
    }
}