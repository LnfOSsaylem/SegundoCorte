public class EmpleadoPorHora extends Empleado {
    private double sPorHora;
    private double pHoraExtra;
    private int nHoras;

    public EmpleadoPorHora() {
    }

    public EmpleadoPorHora(double sPorHora, double pHoraExtra, int nHoras) {
        this.sPorHora = sPorHora;
        this.pHoraExtra = pHoraExtra;
        this.nHoras = nHoras;
    }

    public double getSPorHora() {
        return this.sPorHora;
    }

    public void setSPorHora(double sPorHora) {
        this.sPorHora = sPorHora;
    }

    public double getPHoraExtra() {
        return this.pHoraExtra;
    }

    public void setPHoraExtra(double pHoraExtra) {
        this.pHoraExtra = pHoraExtra;
    }

    public int getNHoras() {
        return this.nHoras;
    }

    public void setNHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    @Override
    public double getLiquidacion() {
        int nHorasE = 0;
        if (this.nHoras > 40) {
            nHorasE = this.nHoras - 40;
        }
        return (nHorasE * this.pHoraExtra) + ((this.nHoras - nHorasE) * sPorHora);
    }

}