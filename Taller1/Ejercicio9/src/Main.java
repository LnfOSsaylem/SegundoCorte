public class Main {
    public static void main(String[] args) {
        Producto[] list = new Producto[100];
        double totalPerecederos = 0;
        double totalNoPerecederos = 0;
        // PERECEDEROS
        list[0] = new Perecedero("Atun", 5500, 3);
        totalPerecederos += list[0].calcular(32);
        list[1] = new Perecedero("Salchicha", 7900, 3);
        totalPerecederos += list[1].calcular(22);
        list[2] = new Perecedero("Manzana", 1000, 3);
        totalPerecederos += list[2].calcular(12);
        list[3] = new Perecedero("Pan Holandes", 2300, 4);
        totalPerecederos += list[3].calcular(8);
        list[4] = new Perecedero("Leche LaVACA", 2200, 30);
        totalPerecederos += list[4].calcular(29);
        // NO PERECEDEROS
        list[5] = new NoPerecedero("Lenteja", 1000, "Granos");
        totalNoPerecederos += list[5].calcular(55);
        list[6] = new NoPerecedero("Arroz", 3200, "Granos");
        totalNoPerecederos += list[6].calcular(36);
        list[7] = new NoPerecedero("Frijol", 1800, "Granos");
        totalNoPerecederos += list[7].calcular(48);
        list[8] = new NoPerecedero("Fideo Oriental", 2300, "Pastas");
        totalNoPerecederos += list[8].calcular(24);
        list[9] = new NoPerecedero("Spaguetti", 5000, "Pastas");
        totalNoPerecederos += list[9].calcular(56);
        System.out.print("\nTotal de productos: " + (totalPerecederos + totalNoPerecederos));
        System.out.print("\nTotal de productos perecederos: " + totalPerecederos);
        System.out.print("\nTotal de productos no perecederos: " + totalNoPerecederos);
    }
}