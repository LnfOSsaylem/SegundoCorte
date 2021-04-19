public class EmpleadoAsalariado extends Empleado {
    private double sueldoSemanal;

    public EmpleadoAsalariado() {
        super();
        this.sueldoSemanal = 0.0;
    }

    public EmpleadoAsalariado(String nombre, double sueldoSemanal) {
        super(nombre);
        this.sueldoSemanal = sueldoSemanal;
    }

    @Override
    public double getSalario() {
        return (this.sueldoSemanal / 7) * 30;
    }
}