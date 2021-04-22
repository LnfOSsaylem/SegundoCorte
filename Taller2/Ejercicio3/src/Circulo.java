public class Circulo extends Figura {
    public Circulo() {

    }

    public Circulo(String c) {
        super(c);
    }

    @Override
    public void dibujar() {
        System.out.print("\nDibujando círculo de color: " + getColor());
    }

    @Override
    public void borrar() {
        System.out.print("\nBorrando círculo de color: " + getColor());
    }

    @Override
    public String queColor() {
        return super.getColor();
    }

    @Override
    public void cambiaColor(String c) {
        System.out.print("\nCambiando color de circulo de color " + getColor() + " a nuevo color: " + c);
        super.cambiaColor(c);
    }
}