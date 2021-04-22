public class Loro extends Ave implements Hablador {
    private String region, color;

    public Loro() {
    }

    public Loro(String sexo, int edad, String region, String color) {
        super(sexo, edad);
        this.region = region;
        this.color = color;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void hablar() {
        System.out.print("\nHola, soy un Loro y sé hablar\nMi sexo es: " + super.getSexo() + "\nMi edad es: "
                + super.getEdad() + "\nMi region es: " + getRegion() + "\nMi color es: " + getColor());
    }
}