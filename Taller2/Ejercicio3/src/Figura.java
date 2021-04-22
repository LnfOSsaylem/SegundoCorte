public abstract class Figura implements Coloreable {
    private String color;

    public Figura() {

    }

    public Figura(String c) {
        this.color = c;
    }

    public String getColor() {
        return this.color;
    }

    public abstract void dibujar();

    public abstract void borrar();

    public abstract String queColor();

    public void cambiaColor(String c) {
        this.color = c;
    }

}