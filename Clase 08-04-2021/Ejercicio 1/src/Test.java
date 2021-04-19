public class Test {
    public static void main(String[] args) {
        Person p = new Person(123, "Ssaylem", "Murillo", 25);
        Doctor d = new Doctor();
        Doctor pepe = new Doctor(235, "JAvi", "Chichon", 29, "Neurologo", "Carrillo Hospitals");
        Teacher teacher1 = new Teacher(155, "Valvaro", "Gonzales", 55, "Sistemas", "Universidad Popular del Cesar");
        System.out.println(p.retornarDatos());
        System.out.println(pepe.retornarDatos());
        System.out.println(teacher1.retornarDatos());
    }
}