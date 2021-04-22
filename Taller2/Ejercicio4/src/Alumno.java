public class Alumno extends Persona implements Hablador {
    private String carrera;
    private String curso;

    public Alumno() {
    }

    public Alumno(String nombre, int edad, String carrera, String curso) {
        super(nombre, edad);
        this.carrera = carrera;
        this.curso = curso;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void hablar() {
        System.out.print("\nHola, soy un Alumno y sé hablar\nMi nombre es: " + super.getNombre() + "\nMi edad es: "
                + super.getEdad() + "\nLa carrera que estudio es: " + getCarrera() + "\nMi curso es: " + getCurso());
    }

}