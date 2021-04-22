public class Main {
    public static void main(String[] args) {
        IOperacion calculadora = new CalculadoraAvanzada();
        System.out.print("Multiplicacion: " + calculadora.multiplicacion(A, B));
        System.out.print("Division: " + calculadora.division(A, B));
        System.out.print("Potenciacion: " + calculadora.potencia(A, B));
    }
}