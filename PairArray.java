public class PairArray {

    public static void pairArray(int number [])
    {
        int tp = 0 ;
        for(int i = 0; i<number.length; i++)
        {
            for(int j = i+1; j<number.length; j++)
            {
                System.out.print("( "+number[i] + ","+number[j]+" ) ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pair = " + tp);

    }
    public static void main(String[] args) 
    {
        int number[] = { 2, 4, 6, 8 , 10};
        pairArray(number);
    }
}
