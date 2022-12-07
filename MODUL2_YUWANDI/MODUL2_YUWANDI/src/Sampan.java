public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    public void informasi(){
        System.out.println("Sampan dengan kursi berjumlah"+jumlahKursi+"ditetapkan biaya sebesar"+biaya);
    }

    public void berlayar(){
        System.out.println("Sampan sedang berlayar menggunakan"+layar+"layar");
    }
    public void berlabuh(){
        System.out.println("Sampan berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Sampan berlabuh di pantai menggunakan"+jangkar+"jangkar");
    }
    
}