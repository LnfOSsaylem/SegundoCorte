public class TV extends Aparato implements Hablador {
    private String teletexto;
    private int antiguedad;

    public TV() {
    }

    public TV(int consumo, double precio, String teletexto, int antiguedad) {
        super(consumo, precio);
        this.teletexto = teletexto;
        this.antiguedad = antiguedad;
    }

    public String setTeletexto() {
        return this.teletexto;
    }

    public String getTeletexto() {
        return this.teletexto;
    }

    public void setTeletexto(String teletexto) {
        this.teletexto = teletexto;
    }

    public int getAntiguedad() {
        return this.antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void hablar() {
        System.out.print("\nHola, soy una TV y sé hablar\nMi consumo es: " + super.getConsumo() + "\nMi precio es: "
                + super.getPrecio() + "\n" + getTeletexto() + " tengo teletexto" + "\nMi antiguedad es: "
                + getAntiguedad() + " años");
    }

}