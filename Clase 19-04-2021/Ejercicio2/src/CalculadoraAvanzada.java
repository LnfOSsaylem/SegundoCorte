import static java.lang.Math.*;

public class CalculadoraAvanzada implements IOperacion {
    @Override
    public double multiplicacion(int A, int B) {
        return A * B;
    }

    @Override
    public int division(int A, int B) {
        return A / B;
    }

    @Override
    public double potencia(int A, int B) {
        return pow(A, B);
    }
}