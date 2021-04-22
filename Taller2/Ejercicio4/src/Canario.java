public class Canario extends Ave {
    private String canta;

    public Canario() {
    }

    public Canario(String sexo, int edad, String canta) {
        super(sexo, edad);
        this.canta = canta;
    }

    public String isCanta() {
        return this.canta;
    }

    public String getCanta() {
        return this.canta;
    }

    public void setCanta(String canta) {
        this.canta = canta;
    }

}