//Brute Force

public class MaxSubArray {
    public static void maxSubArray(int number [])
        {
            int currSum = 0 ;
            int maxSum = 0;

            for(int i = 0 ; i<number.length; i++)
            {
                for ( int j = i; j<number.length; j++)
                {
                    currSum = 0;
                    for ( int k = i; k<=j; k++)
                    {
                        //subarray sum
                        currSum += number[k];
                    }
                    System.out.println(currSum);
                    if (maxSum < currSum) {
                        maxSum = currSum ;
                    }                    
                }
            }
            System.out.println("Maximum sum of Sub Array is " + maxSum);
        }
    
    public static void main(String[] args) {
        int number [] = {2, 4, 6, 8, 10};
        maxSubArray(number);
    }
}


        