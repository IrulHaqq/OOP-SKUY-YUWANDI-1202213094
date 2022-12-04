public class Handphone extends Perangkat {

    protected boolean fingerprint;

    public Handphone(String name, String drive, int ram, String processor, boolean fingerprint) {
        super(name, drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi() {
        super.informasi();

        if (fingerprint) {
            System.out.println("Memiliki Fingerpirnt");
        } else {
            System.out.println("Tidak Memiliki Fingerprint");
        }
    }

    public void call(int nomerHP) {
        System.out.println("Handphone " + this.name + " Make Call to " +nomerHP);
    }

    public void sms(int nomerHP) {
        System.out.println("Handphone " + this.name + " Send Message to " +nomerHP);
    }

    public void sms(int nomerHP, int nomerHP2) {
        System.out.println("Handphone " + this.name + " Send Message to " +nomerHP + " dan " +nomerHP2);
    }


}