package praktikum;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static boolean repeat = true;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            try{
                System.out.println("=== Menu Program ===");
                System.out.println("1. Square");
                System.out.println("2. Circle");
                System.out.println("3. Trapoized");
                System.out.println("0. Exit");
                System.out.print("Select menu : ");
                int option = scan.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Enter the length of the side of the square: ");
                        double SqureSide = scan.nextDouble();
                        break;
                    case 2:
                        System.out.println("Enter the radius of the circle: ");
                        double CircleRadius = scan.nextDouble(); 
                    case 3:
                        System.out.println("Enter the side of the base of the trapezoid: ");
                        double TrapezoidSide = scan.nextDouble();
                        System.out.println("Enter the upper side of the trapezoid: ");
                        double TrapezoidUpperSide = scan.nextDouble();
                        System.out.println("Enter the height of the trapezoid: ");
                        double TrapezoidHeight = scan.nextDouble();
                        break;
                    case 0 :
                        System.out.println("Program selesai");
                        repeat = false;
                        break;
                    default:
                        System.out.println("Option not available");
                        continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("====Error: Input must be a number====");
                continue;
            } catch (IllegalArgumentException e) {
                System.out.println(e);
                continue;
            }
            
        } while (repeat);
        scan.close();
    }
}