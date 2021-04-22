public class Profesor extends Persona implements Hablador {
    private String despacho;
    private String email;

    public Profesor() {

    }

    public Profesor(String nombre, int edad, String despacho, String email) {
        super(nombre, edad);
        this.despacho = despacho;
        this.email = email;
    }

    public String getDespacho() {
        return this.despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void hablar() {
        System.out.print("\nHola, soy un Profesor y sé hablar\nMi nombre es: " + super.getNombre() + "\nMi edad es: "
                + super.getEdad() + "\nMi despacho es: " + getDespacho() + "\nMi email es: " + getEmail());
    }

}