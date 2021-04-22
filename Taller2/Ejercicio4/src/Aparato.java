public class Aparato {
    private int consumo;
    private double precio;

    public Aparato() {
    }

    public Aparato(int consumo, double precio) {
        this.consumo = consumo;
        this.precio = precio;
    }

    public int getConsumo() {
        return this.consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}