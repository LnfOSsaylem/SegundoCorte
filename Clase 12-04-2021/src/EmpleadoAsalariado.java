public class EmpleadoAsalariado extends Empleado {

    private double pSemanal;

    public EmpleadoAsalariado() {
    }

    public EmpleadoAsalariado(double pSemanal) {
        this.pSemanal = pSemanal;
    }

    public double getPSemanal() {
        return this.pSemanal;
    }

    public void setPSemanal(double pSemanal) {
        this.pSemanal = pSemanal;
    }

    @Override
    public double getLiquidacion() {
        return this.pSemanal / 7 * 30;
    }

}