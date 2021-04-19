public class Main {
    public static void main(String[] args) {
        System.out.println("\033\143");
        Empleado E1 = new Empleado("RAFA");
        Directivo D1 = new Directivo("PIPE");
        Operario OP1 = new Operario("JUANCHO");
        Oficial OF1 = new Oficial("DAFT");
        Tecnico TE1 = new Tecnico("PUNK");
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(TE1);
        System.out.println("\n");

    }
}