public class Sobremesa extends Ordenador {
    private String descripcionTorre;

    public Sobremesa() {
    }

    public Sobremesa(int codigo, double precio, String eslogan, String descripcionTorre) {
        super(codigo, precio, eslogan);
        this.descripcionTorre = descripcionTorre;
    }

    public String getDescripcionTorre() {
        return this.descripcionTorre;
    }

    public void setDescripcionTorre(String descripcionTorre) {
        this.descripcionTorre = descripcionTorre;
    }
}
