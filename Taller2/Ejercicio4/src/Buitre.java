public class Buitre extends Ave {
    private double velocidadVuelo;
    private double peso;

    public Buitre() {
    }

    public Buitre(String sexo, int edad, double velocidadVuelo, double peso) {
        super(sexo, edad);
        this.velocidadVuelo = velocidadVuelo;
        this.peso = peso;
    }

    public double getVelocidadVuelo() {
        return this.velocidadVuelo;
    }

    public void setVelocidadVuelo(double velocidadVuelo) {
        this.velocidadVuelo = velocidadVuelo;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}