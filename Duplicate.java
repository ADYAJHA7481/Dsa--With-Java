public class Duplicate {

    //Brute Forse
    public static int checkDuplicate(int number[])
    {
        for(int i=0; i<number.length-1; i++)
        {
            for(int j=i+1; j<number.length; j++)
            {
                if (number[i]==number[j]) {
                    return 1;
                }
            }
        }
        return 0;
    }
    

    public static void main(String[] args) {
        int number[] = {1, 2, 3, 1};
        int result = checkDuplicate(number);

        if (result==1) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
