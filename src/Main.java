import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1 ci tapşırıq
        Scanner a = new Scanner(System.in);

        while (true){

            System.out.println("Rəqəm daxil edin:");
            int num1 = a.nextInt();
            System.out.println("Rəqəm daxil edin:");
            int num2 = a.nextInt();

            try {
                int c = num1/num2;
                break;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            } catch (ArithmeticException b) {
                System.out.println(b.getMessage());
            } finally {
                System.out.println("Bitti");
            }
        }

        // 2 ci tapşırıq

        String[] names = {"Ali","Vwsal","Aysel"};
        System.out.println("Index daxil edin:");
        int index = a.nextInt();

        try {
            System.out.println("Element:" + names[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Yanlış index seçdiniz");
        } finally {
            System.out.println("Bitti");
        }

    }
}