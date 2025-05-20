import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        int count = 0, num = 1;
        while (count < a) {
            System.out.print(num);
            if (count < a - 1) {
                System.out.print(", ");
            }
            num += 2;
            count++;
        }
    }
}
