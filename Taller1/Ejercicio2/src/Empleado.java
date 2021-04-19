public class Empleado {
    private String nombre;

    public Empleado() {
        this("XXX");
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "\nEmpleado " + getNombre();
    }

}