public class PrefixSum {
    public static void maxSubArray(int number [])
        {
            int currSum = 0 ;
            int maxSum = 0;
            int prefix[] = new int[number.length];

            //calculate prefix array
            prefix[0] = number[0] ;
            for(int i = 1; i<prefix.length; i++){
                prefix[i] = prefix[i-1] + number[i] ;
            }

            for(int i = 0 ; i<number.length; i++)
            {
                for ( int j = i; j<number.length; j++)
                {
                    currSum =i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

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
