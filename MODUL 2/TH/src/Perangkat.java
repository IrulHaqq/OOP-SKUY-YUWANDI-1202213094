public class Perangkat {

    protected String name;
    protected String drive;
    protected int ram;
    protected String processor;

    public Perangkat(String name, String drive, int ram,String processor) {
        this.name = name;
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public void informasi() {
        System.out.println(
                "Perangkat " + this.name + " memiliki drive tipe " + this.drive + " dengan RAM sebesar " + this.ram + " dan processor " + this.processor
        );
    }
}