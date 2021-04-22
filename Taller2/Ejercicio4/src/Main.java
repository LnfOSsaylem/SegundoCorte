public class Main {
    public static void main(String[] args) {
        Hablador[] habladores = new Hablador[7];
        habladores[0] = new Loro("Masculino", 8, "Amazonas", "Verde");
        habladores[1] = new Piolin("Mujer", 4, "uuuuiiiiuuua", 5);
        habladores[2] = new Alumno("Ssaylem", 27, "Ing. de Sistemas", "Programacion II");
        habladores[3] = new Profesor("Jairo", 40, "Despacho X", "jairoseones@unicesar.edu.co");
        habladores[4] = new Bedel("Pepe", 69, 4, 10);
        habladores[5] = new TV(5800, 5000, "Si", 10);
        habladores[6] = new Radio(300, 5200, "Si", 65);
        for (int i = 0; i < habladores.length; i++) {
            habladores[i].hablar();
        }
    }
}