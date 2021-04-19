import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("\033\143");
        Test1();
        Test2();
    }

    public static void Test1() {
        Profesor profesor1 = new Profesor("Juan", "Hernandez Garcia", "Prof 22-387-11");
        System.out.println(profesor1.toString());
    }

    public static void Test2() {
        Date fecha = new Date();
        ProfesorInterino profesor1 = new ProfesorInterino("Juan", "Hernandez Garcia", "Prof 22-387-11", fecha);
        System.out.println(profesor1.toString());
    }
}