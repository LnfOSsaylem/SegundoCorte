
import java.util.Date;

public class ProfesorInterino extends Profesor {
    
    // ATRIBUTES
    private Date fechaIncorporacion;

    // CONSTRUCTORS
    public ProfesorInterino() {
    }
    public ProfesorInterino(String nombre,String apellidos, String idProfesor, Date fechaIncorporacion) {
        super(nombre, apellidos, idProfesor);
        this.fechaIncorporacion = fechaIncorporacion;
    }

    // GETTERS AND SETTERS
    public Date getfechaIncorporacion() {
        return this.fechaIncorporacion;
    }

    public void setfechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }
    // TO STRING OVERRIDE
    @Override
    public String toString() {
        return "Profesor iterino "+super.getNoProfesor()+" se incorporo en la fecha: " + getfechaIncorporacion();
    }

    
}