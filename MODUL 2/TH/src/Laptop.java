public class Laptop extends Perangkat{
    protected boolean webcam;

    public Laptop(String name, String drive, int ram, String processor, boolean webcam) {
        super(name, drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi() {
        super.informasi();
        if (webcam) {
            System.out.println("Memiliki Fingerprint");
        } else {
            System.out.println("Tidak Memiliki Fingerprint");
        }
    }

    public void BukaGame(String gameName) {
        System.out.println("Laptop " +name+ " bisa membuka game " +gameName);
    }

    public void KirimEmail(String email) {
        System.out.println("laptop " + this.name + " Mengirim Email ke " +email);
    }

    
    public void KirimEmail(String email, String email2) {
        System.out.println("Laptop " + this.name + " Mengirim Email ke " +email + " dan " +email2);
    }
}