public class Cuadrado extends Figura {
    public Cuadrado() {

    }

    public Cuadrado(String c) {
        super(c);
    }

    @Override

    public void dibujar() {
        System.out.print("\nDibujando cuadrado de color: " + getColor());
    }

    @Override
    public void borrar() {
        System.out.print("\nBorrando cuadrado de color: " + getColor());
    }

    @Override
    public String queColor() {
        return super.getColor();
    }

    @Override
    public void cambiaColor(String c) {
        System.out.print("\nCambiando color de cuadrado de color " + getColor() + " a nuevo color: " + c);
        super.cambiaColor(c);
    }
}