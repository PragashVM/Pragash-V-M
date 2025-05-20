import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();


        int oddCount;
        if (a % 2 == 0)
        {
            oddCount = a - 1;
        }
        else{
            oddCount = a;
        }

        int number = 1;
        for (int i = 0; i < oddCount; i++) {
            System.out.print(number);
            if (i < oddCount - 1) {
                System.out.print(", ");
            }
            number += 2;
        }
    }
}
