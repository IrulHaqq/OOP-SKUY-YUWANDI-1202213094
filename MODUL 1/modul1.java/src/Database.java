import java.util.*;

public class Database {
    static Scanner scan = new Scanner(System.in);

    class database{
        static ArrayList<String> menu_list = new ArrayList<String>();

        public static void Insert_Menu(String menu_name, String menu_type, int menu_price ) {
            menu_list.add(menu_name);
            menu_list.add(menu_type);
            menu_list.add(Integer.toString(menu_price));     
        }
        public static void Show_Menu() {
            System.out.println("Menu");
            System.out.println("==========");
            for(int i = 0; i < menu_list.size();i+=3){
                System.out.println((i/3+1)+". "+menu_list.get(i)+" ("+menu_list.get(i+1)+") "+"Rp. "+menu_list.get(i+2));
            }
            System.out.println("===========");
         }
        public static void Search_Menu() {
            System.out.print("Masukan nama menu : ");
            scan.nextLine();
            String search_menu = scan.nextLine();
            String[] title = search_menu.split(" ");
            String search_menu_titled = ""; 
            for(int i = 0;i<title.length;i++) {
            search_menu_titled += title[i].substring(0,1).toUpperCase()+title[i].substring(1,title[i].length());
            if (i!=(title.length-1)){
                search_menu_titled += " ";
            }
            System.out.println("Hasil Pencarian : "+search_menu_titled);
            System.out.println("===========");
            if (menu_list.contains(search_menu_titled)) {
                int index_menu = menu_list.indexOf(search_menu_titled);
                System.out.println((index_menu/3+1)+". "+ menu_list.get(index_menu)+ " ("+menu_list.get(index_menu+1)+") "+"Rp. "+menu_list.get(index_menu+2));
            }else{
                System.out.println("Menu tidak ada!");
            }
            System.out.println("===========");
            }
        }
    }
}