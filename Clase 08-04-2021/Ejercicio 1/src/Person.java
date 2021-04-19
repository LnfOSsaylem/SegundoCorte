public class Person { // Se usa extends para la herencia
    private int id;
    private String name, lastName;
    private int age;

    public Person() {
        // super(); LLAMADO IMPLICITO AL CONSTRUCTOR DE LA CLASE OBJECT
    }

    public Person(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String retornarDatos() {
        return "\nPersona\nid: " + this.id + "\nNombre: " + this.name + "\nApellido: " + this.lastName + "\nEdad: "
                + this.age;
    }
}