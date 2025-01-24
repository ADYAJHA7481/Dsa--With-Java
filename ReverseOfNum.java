import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {
        System.out.print("Enter Number for reverse : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // while (num > 0) {
        //     int lastDigit = num % 10;
        //     System.out.print(lastDigit);
        //     num = num / 10;      
        // }
        // System.out.println();
        

        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse*10) + lastDigit;
            num = num / 10;      
        }
        System.out.println(reverse);

        sc.close();

    }
}
