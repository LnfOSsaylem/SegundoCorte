public class Radio extends Aparato implements Hablador {
    private String cassete;
    private int potencia;

    public Radio() {
    }

    public Radio(int consumo, double precio, String cassete, int potencia) {
        super(consumo, precio);
        this.cassete = cassete;
        this.potencia = potencia;
    }

    public String setCassete() {
        return this.cassete;
    }

    public String getCassete() {
        return this.cassete;
    }

    public void setCassete(String cassete) {
        this.cassete = cassete;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void hablar() {
        System.out.print("\nHola, soy una Radio y sé hablar\nMi consumo es: " + super.getConsumo() + "\nMi precio es: "
                + super.getPrecio() + "\n" + getConsumo() + " tengo casette" + "\nMi potencia es: " + getPotencia());
    }

}