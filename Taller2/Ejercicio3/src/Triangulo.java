public class Triangulo extends Figura {
    public Triangulo() {

    }

    public Triangulo(String c) {
        super(c);
    }

    @Override

    public void dibujar() {
        System.out.print("\nDibujando triangulo de color: " + getColor());
    }

    @Override

    public void borrar() {
        System.out.print("\nBorrando triangulo de color: " + getColor());
    }

    @Override

    public String queColor() {
        return super.getColor();
    }

    @Override

    public void cambiaColor(String c) {
        System.out.print("\nCambiando color de triangulo de color " + getColor() + " a nuevo color: " + c);
        super.cambiaColor(c);
    }
}