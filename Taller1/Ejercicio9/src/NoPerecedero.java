public class NoPerecedero extends Producto {
    private String tipo;

    public NoPerecedero() {
    }

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: " + getTipo();
    }

    public double calcular(int cantidadProductos) {
        return super.calcular(cantidadProductos);
    }
}