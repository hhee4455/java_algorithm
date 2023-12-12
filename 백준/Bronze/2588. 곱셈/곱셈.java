import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int step3 = num1 * (num2 % 10);  
        int step4 = num1 * ((num2 / 10) % 10);  
        int step5 = num1 * (num2 / 100);  
        int result = num1 * num2;  

        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(result);
    }
}