public class Doctor extends Person {
    private String speciality, hospital;

    public Doctor() {
        super();
    }

    public Doctor(int id, String name, String lastName, int age, String speciality, String hospital) {
        super(id, name, lastName, age);
        this.speciality = speciality;
        this.hospital = hospital;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getHospital() {
        return this.hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String retornarDatos() {
        return "\nDoctor\nEspecialidad: " + this.speciality + "\nHospital: " + this.hospital + super.retornarDatos();
    }

}