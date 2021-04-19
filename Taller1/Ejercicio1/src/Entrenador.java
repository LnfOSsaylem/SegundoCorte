public class Entrenador extends Persona {
    private String idFederacion;

    public Entrenador() {
        super();
        this.idFederacion = "XXX";
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return this.idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    public void dirigirPartido(){
    }
    public void dirigirEntrenamiento(){
    }

}