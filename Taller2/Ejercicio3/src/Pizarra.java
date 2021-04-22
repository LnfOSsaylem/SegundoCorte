import java.util.*;

public class Pizarra {
    private ArrayList<Figura> figuras;

    public Pizarra() {
    }

    public Pizarra(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }

    public ArrayList<Figura> getFiguras() {
        return this.figuras;
    }

    public void setFiguras(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }

    public void agregarFigura(Figura f) {
        figuras.add(f);
    }

    public void borrarFiguras() {
        figuras.clear();
    }

    public void dibujarFiguras() {
        for (int i = 0; i < figuras.size(); i++) {
            figuras.get(i).dibujar();
        }
    }
}