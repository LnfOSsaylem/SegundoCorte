public class CapacidadLimite {
    private final int limitePASAJEROSAUTOS = 5;
    Automovil a;
    Camion camion;
    private final int limitePASAJEROSCAMIONES = 8;

    public CapacidadLimite(Automovil a) {
        this.a = a;
    }

    public CapacidadLimite(Camion c) {
        this.camion = c;
    }

    public int getLimitePASAJEROSAUTOS() {
        if (this.a.getEstilo().equals("VANS")) {
            return this.limitePASAJEROSAUTOS + 1;
        } else {
            return this.limitePASAJEROSAUTOS;
        }
    }

    public int getLimitePASAJEROSCAMIONES() {
        return this.limitePASAJEROSCAMIONES;
    }
}