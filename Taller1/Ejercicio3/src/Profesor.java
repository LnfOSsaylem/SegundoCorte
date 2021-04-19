
public class Profesor extends Persona {

    private String idProfesor;
    int noProfesor = 0;

    public Profesor() {
    }

    public Profesor(String nombre, String apellidos, String idProfesor) {
        super(nombre, apellidos);
        noProfesor++;
        this.idProfesor = idProfesor;
    }

    public String getIdProfesor() {
        return this.idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public int getNoProfesor() {
        return this.noProfesor;
    }

    public void setNoProfesor(int noProfesor) {
        this.noProfesor = noProfesor;
    }

    @Override
    public String toString() {
        return "Profesor de " + super.toString() + " con id de Profesor: " + getIdProfesor();
    }

}