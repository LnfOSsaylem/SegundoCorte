public class Bedel extends Persona implements Hablador {
    private int turno;
    private int antiguedad;

    public Bedel() {
    }

    public Bedel(String nombre, int edad, int turno, int antiguedad) {
        super(nombre, edad);
        this.turno = turno;
        this.antiguedad = antiguedad;
    }

    public int getTurno() {
        return this.turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getAntiguedad() {
        return this.antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void hablar() {
        System.out.print("\nHola, soy un Bedel y sé hablar\nMi nombre es: " + super.getNombre() + "\nMi edad es: "
                + super.getEdad() + "\nMi turno es: " + getTurno() + "\nMi antiguedad aqui es: " + getAntiguedad());
    }

}