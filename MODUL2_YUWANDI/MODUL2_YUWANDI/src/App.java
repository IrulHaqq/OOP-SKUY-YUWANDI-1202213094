public class App {
    public static void main(String[] args) throws Exception {
        TransportasiAir p1 = new TransportasiAir(10, 20000);
        p1.informasi();
        p1.berlayar();
        p1.berlabuh();

        System.out.println();

        Sampan h1 = new Sampan(4, 100000, 2);
        h1.informasi();
        h1.berlayar();
        h1.berlabuh();
        h1.berlabuh(5);

        System.out.println();

        Kapal l1 = new Kapal(100, 50000, "Diesel");
        l1.informasi();
        l1.berlayar();
        l1.berlayar(50);
        l1.berlabuh();
    }
}
