
public class Vehiculo {

    private String serieMotor;
    private String marca;
    private int ano;
    private double precio;

    public Vehiculo() {
    }

    public Vehiculo(final String serieMotor, final String marca, final int ano, final double precio) {
        this.serieMotor = serieMotor;
        this.marca = marca;
        this.ano = ano;
        this.precio = precio;
    }

    public String getSerieMotor() {
        return this.serieMotor;
    }

    public void setSerieMotor(final String serieMotor) {
        this.serieMotor = serieMotor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(final String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(final int ano) {
        this.ano = ano;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(final double precio) {
        this.precio = precio;
    }

    public String toString() {
        return "\n-----------------------\n" + "\nNumero de serie del motor: " + getSerieMotor() + "\nMarca: "
                + getMarca() + "\nAño: " + getAno() + "\nPrecio: " + getPrecio();

    }
}