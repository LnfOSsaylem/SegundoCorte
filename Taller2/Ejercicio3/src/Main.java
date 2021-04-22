import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList();
        figuras.add(new Cuadrado("Azul"));
        figuras.add(new Circulo("Verde"));
        figuras.add(new Triangulo("Morado"));
        figuras.add(new Cuadrado("Amarillo"));

        // PROBANDO EL ARRAY DE FIGURAS EN PIZARRA 1
        System.out.println("\nPROBANDO EL ARRAY DE FIGURAS EN PIZARRA 1");
        Pizarra pizarra1 = new Pizarra(figuras);
        pizarra1.dibujarFiguras();
        Figura f = new Circulo("Rosa");

        // AGREGANDO NUEVA FIGURA
        System.out.println("\nAGREGANDO AL ARRAY DE FIGURAS EN PIZARRA 1");
        pizarra1.agregarFigura(f);
        pizarra1.dibujarFiguras();

        // PROBANDO BORRADO
        System.out.println("\nBORRADO DEL ARRAY");
        pizarra1.borrarFiguras();
    }
}