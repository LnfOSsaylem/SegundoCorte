import java.util.Scanner;

public class Principal {
    public static void main(final String[] args) {
        char mas;
        final Scanner input = new Scanner(System.in);
        mas = 'S';
        int nel = 0;
        final Cuadrilatero[] list = new Cuadrilatero[100];
        do {
            System.out.print("\nDigite el valor del vertice 1 en X: ");
            final int ejex1 = input.nextInt();
            System.out.print("\nDigite el valor del vertice 1 en Y: ");
            final int ejey1 = input.nextInt();
            System.out.print("\nDigite el valor del vertice 2 en X: ");
            final int ejex2 = input.nextInt();
            System.out.print("\nDigite el valor del vertice 2 en Y: ");
            final int ejey2 = input.nextInt();
            System.out.print("\nDigite el valor del vertice 3 en X: ");
            final int ejex3 = input.nextInt();
            System.out.print("\nDigite el valor del vertice 3 en Y: ");
            final int ejey3 = input.nextInt();
            System.out.print("\nDigite el valor del vertice 4 en X: ");
            final int ejex4 = input.nextInt();
            System.out.print("\nDigite el valor del vertice 4 en Y: ");
            final int ejey4 = input.nextInt();
            System.out.print("\n\nQue tipo de figura desea? (c: Cuadrado, r: Rectangulo, t: Trapecio): ");
            final char f = input.next().charAt(0);
            if (f == 'c') {
                final Cuadrilatero c = new Cuadrado(ejex1, ejey1, ejex2, ejey2, ejex3, ejey3, ejex4, ejey4);
                list[nel] = c;
                nel++;
            } else {
                if (f == 't') {
                    final Cuadrilatero c = new Trapecio(ejex1, ejey1, ejex2, ejey2, ejex3, ejey3, ejex4, ejey4);
                    list[nel] = c;
                    nel++;
                } else {
                    final Cuadrilatero c = new Rectangulo(ejex1, ejey1, ejex2, ejey2, ejex3, ejey3, ejex4, ejey4);
                    list[nel] = c;
                    nel++;
                }
            }
            System.out.print("Desea digitar una nueva figura? (S/N): ");
            mas = input.next().charAt(0);
        } while (mas == 'S');
        calculoArea(list, nel);
        calculoPerimetro(list, nel);
    }

    public static void calculoArea(final Cuadrilatero[] list, final int nel) {
        for (int i = 0; i < nel; i++) {
            double area = 0;
            int sumatoriaA = 0;
            int sumatoriaB = 0;
            sumatoriaA = ((list[i].getEjex1() * list[i].getEjey2()) + (list[i].getEjex2() * list[i].getEjey3())
                    + (list[i].getEjex3() * list[i].getEjey4()) + (list[i].getEjex4() * list[i].getEjey1()));
            sumatoriaB = ((list[i].getEjey1() * list[i].getEjex2()) + (list[i].getEjey2() * list[i].getEjex3())
                    + (list[i].getEjey3() * list[i].getEjex4()) + (list[i].getEjey4() * list[i].getEjex1()));
            area = ((sumatoriaB - sumatoriaA) / 2);
            if (area < 0) {
                area = area * (-1);
            }
            if (list[i] instanceof Cuadrado) {
                System.out.printf("\nEl area de la figura " + (i + 1) + " (Cuadrado) es: %.1f u²", area);
            } else {
                if (list[i] instanceof Trapecio) {
                    System.out.printf("\nEl area de la figura " + (i + 1) + " (Trapecio) es: %.1f u²", area);
                } else {
                    System.out.printf("\nEl area de la figura " + (i + 1) + " (Rectangulo) es: %.1f u²", area);
                }
            }
        }
    }

    public static void calculoPerimetro(final Cuadrilatero[] list, final int nel) {
        double perimetro = 0, d1 = 0, d2 = 0, d3 = 0, d4 = 0;
        for (int i = 0; i < nel; i++) {
            d1 = Math.sqrt((Math.pow((list[i].getEjex2() - list[i].getEjex1()), 2)
                    + (Math.pow((list[i].getEjey2() - list[i].getEjey1()), 2))));
            d2 = Math.sqrt((Math.pow((list[i].getEjex3() - list[i].getEjex2()), 2)
                    + (Math.pow((list[i].getEjey3() - list[i].getEjey2()), 2))));
            d3 = Math.sqrt((Math.pow((list[i].getEjex4() - list[i].getEjex3()), 2)
                    + (Math.pow((list[i].getEjey4() - list[i].getEjey3()), 2))));
            d4 = Math.sqrt((Math.pow((list[i].getEjex1() - list[i].getEjex4()), 2)
                    + (Math.pow((list[i].getEjey1() - list[i].getEjey4()), 2))));
            perimetro = d1 + d2 + d3 + d4;
            if (list[i] instanceof Cuadrado) {
                System.out.printf("\nEl perimetro de la figura " + (i + 1) + " (Cuadrado) es: %.1f u", perimetro);
            } else {
                if (list[i] instanceof Trapecio) {
                    System.out.printf("\nEl perimetro de la figura " + (i + 1) + " (Trapecio) es: %.1f u", perimetro);
                } else {
                    System.out.printf("\nEl perimetro de la figura " + (i + 1) + " (Rectangulo) es: %.1f u", perimetro);
                }
            }
        }
    }
}