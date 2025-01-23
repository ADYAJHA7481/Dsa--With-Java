public class SubArray {

    public static void printSubArray(int number [])
    {
        int total = 0;
        for(int i = 0 ; i<number.length; i++)
        {
            for ( int j = i; j<number.length; j++)
            {
                for ( int k = i; k<=j; k++)
                {
                    System.out.print(number[k] + " ");
                }
                System.out.println();
                total++;
            }
            System.out.println();
            
        }
        System.out.println("Total Subarray are : " + total);
    }
    

    public static void main(String[] args) {
        int number [] = {2, 4, 6, 8, 10};
        printSubArray(number);
    }
}
