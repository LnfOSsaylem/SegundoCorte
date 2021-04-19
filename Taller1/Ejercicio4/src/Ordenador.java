public class Ordenador {
    private int codigo;
    private double precio;
    private String eslogan;

    public Ordenador() {
    }

    public Ordenador(int codigo, double precio, String eslogan) {
        this.codigo = codigo;
        this.precio = precio;
        this.eslogan = eslogan;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEslogan() {
        return this.eslogan;
    }

    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }

}