public class Perecedero extends Producto {
    private int diasaCaducar;

    public Perecedero() {
    }

    public Perecedero(String nombre, double precio, int diasaCaducar) {
        super(nombre, precio);
        this.diasaCaducar = diasaCaducar;
    }

    public int getDiasaCaducar() {
        return this.diasaCaducar;
    }

    public void setDiasaCaducar(int diasaCaducar) {
        this.diasaCaducar = diasaCaducar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDias a caducar: " + getDiasaCaducar();
    }

    @Override
    public double calcular(int cantidadProductos) {
        if (this.diasaCaducar == 1) {
            return (super.calcular(cantidadProductos) / 4);
        } else if (this.diasaCaducar == 2) {
            return (super.calcular(cantidadProductos) / 3);
        } else if (this.diasaCaducar == 3) {
            return (super.calcular(cantidadProductos) / 2);
        } else {
            return super.calcular(cantidadProductos);
        }
    }
}