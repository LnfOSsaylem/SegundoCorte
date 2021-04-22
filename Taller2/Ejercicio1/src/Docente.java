public class Docente implements Trabajador {
    private int nHoras;
    private final double pagoH = 120;
    private final double bonificacion = 70;

    public Docente() {
    }

    public Docente(int nHoras) {
        this.nHoras = nHoras;
    }

    public int getNHoras() {
        return this.nHoras;
    }

    public void setNHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    public double getPagoH() {
        return this.pagoH;
    }

    public double getBonificacion() {
        return this.bonificacion;
    }

    public double getLiquidacion() {
        return this.nHoras * this.pagoH + ((this.nHoras * this.pagoH) * this.bonificacion / 100);
    }

}