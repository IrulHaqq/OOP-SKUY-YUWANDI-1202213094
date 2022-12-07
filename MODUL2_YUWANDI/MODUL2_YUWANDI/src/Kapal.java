public class Kapal extends TransportasiAir{
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    public void informasi(){
        System.out.println("dengan kursi berjumlah"+jumlahKursi+"ditetapkan biaya sebesar"+biaya+"");
    }
    public void berlayar(){
        System.out.println("Sedang berlayar menggunakan mesin"+mesin+"dengan kecepatan tidak stabil");
    }
    public void berlayar(int kecepatan){
        System.out.println("Sedang berlayar menggunakan mesin"+mesin+" dengan kecepatan stabil kisaran"+kecepatan+"knot");
    }
    public void berlabuh(){
        System.out.println("Kapal berlabuh di pantai");
    }
}