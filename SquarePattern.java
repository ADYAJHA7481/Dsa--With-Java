import java.util.*;

public class SquarePattern {
    public static void main(String[] args) {
        System.out.print("Enter no. of line : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=num; j++){
                System.out.print("* ");
            } 
            System.out.println("");
        }

        sc.close();
        
    }
}
