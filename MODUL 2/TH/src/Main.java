public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop("OMEN 15 HP", "HP", 8, "Core i7", true);
        l1.informasi();
        l1.BukaGame("Dota");
        l1.KirimEmail("bemybestfriendruli@gmail.com");
        l1.KirimEmail("bemybestfriendruli.com" , "yuwandiruli@student.telkomuniversity.ac.id");
        
        Handphone h1 = new Handphone("POCO M4 PRO", "POCO", 16 ,"Heli G696", true);
        h1.informasi();
        h1.call(123456789);
        h1.sms(123456789);
        h1.sms(123456789, 321321);

        System.out.println();

        
    }
}