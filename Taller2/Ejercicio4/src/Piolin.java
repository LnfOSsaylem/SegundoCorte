public class Piolin extends Canario implements Hablador {
    private int nPeliculas;

    public Piolin() {
    }

    public Piolin(String sexo, int edad, String canta, int nPeliculas) {
        super(sexo, edad, canta);
        this.nPeliculas = nPeliculas;
    }

    public int getNPeliculas() {
        return this.nPeliculas;
    }

    public void setNPeliculas(int nPeliculas) {
        this.nPeliculas = nPeliculas;
    }

    public void hablar() {
        System.out.print("\nHola, soy Piolin y sé hablar\nMi sexo es: " + super.getSexo() + "\nMi edad es: " + getEdad()
                + "\nCanto asi: " + super.getCanta() + "\nMi numero de peliculas es: " + getNPeliculas());
    }

}