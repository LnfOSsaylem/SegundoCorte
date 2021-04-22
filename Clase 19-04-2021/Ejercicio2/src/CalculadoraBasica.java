import java.lang.Math.*;

public class CalculadoraBasica implements IOperacion {
    @Override
    public double multiplicacion(int A, int B) {
        double total = 0;
        for (int i = 0; i < B; i++) {
            total += A;
        }
        return total;
    }

    @Override
    public int division(int A, int B) {
        int total = 0;
        int aux = N;
        while(aux>=D){
            aux ==D;
            total++;
        }
        return total;
    }

    @Override
    public double potencia(int A, int B) {
        return pow(A, B);
    }
}