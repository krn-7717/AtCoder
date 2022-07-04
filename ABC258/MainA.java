import java.util.Scanner;

public class MainA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k >= 0 && k < 10) {
            System.out.println("21:0" + k);      
        }else if (k >= 10 && k < 60) {
            System.out.println("21:" + k);
        }else if (k >= 60 && k < 70) {
            k = k - 60;
            System.out.println("22:0" + k);
        }else if (k >= 70 && k <= 100) {
            k = k - 60;
            System.out.println("22:" + k);
        }
    }
}
