public class Portatil extends Ordenador {
    private double peso;

    public Portatil() {
    }

    public Portatil(int codigo, double precio, String eslogan, double peso) {
        super(codigo, precio, eslogan);
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}