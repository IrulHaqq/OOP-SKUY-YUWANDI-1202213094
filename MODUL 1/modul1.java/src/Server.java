import java.util.*;

class Server{
    public static void menu(){
        System.out.println("====================");
        System.out.println("1. Menu");
        System.out.println("2. Pilih Menu");
        System.out.println("3. Keluar");
        System.out.println("====================");
    }
public static void Pilih_Menu(){
    Scanner scan = new Scanner(System.in);
    while(true){
        System.out.print("Masukkan Pilihan: ");
        int select = scan.nextInt();
        if (select == 1){
            Database.Show_Menu();
        }else if (select == 2){
            Database.Search_Menu();
        }else if (select == 3){
            System.out.println("Terimakasih");
            break;
        }
    }
}
}