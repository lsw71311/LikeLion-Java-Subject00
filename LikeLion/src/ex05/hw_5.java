package ex05;
import java.util.Scanner;

public class hw_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요. ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요. ");
        int num2 = scanner.nextInt();

        int a = (num1 > num2)? num1 : num2;
        System.out.print(a);

    }
}