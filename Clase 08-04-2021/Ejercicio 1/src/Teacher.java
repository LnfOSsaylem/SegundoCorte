public class Teacher extends Person {
    private String asignatura, universidad;

    public Teacher() {

    }

    public Teacher(int id, String name, String lastName, int age, String asignatura, String universidad) {
        super(id, name, lastName, age);
        this.asignatura = asignatura;
        this.universidad = universidad;
    }

    public String getAsignatura() {
        return this.asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getUniversidad() {
        return this.universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String retornarDatos() {
        return "\nAsignatura: " + this.asignatura + "\nUniversidad: " + this.universidad + super.retornarDatos();
    }

}