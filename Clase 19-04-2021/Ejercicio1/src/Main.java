public class Main {
    public static void main(String[] args) {
        PuedeCantar[] p = new PuedeCantar[3];

        PuedeCantar persona = new Persona();
        p[0] = persona;
        PuedeCantar gallo = new Gallo();
        p[1] = gallo;
        PuedeCantar canario = new Canario();
        p[2] = canario;
        mostrarCanto(p);

    }

    public static void mostrarCanto(PuedeCantar[] p) {
        for (int i = 0; i < p.length; i++) {
            p[i].cantar();
        }
    }
}