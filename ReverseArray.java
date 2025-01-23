public class ReverseArray {

    public static void reverseArray(int number[])
    {
        int first = 0 , last = number.length-1;
        while (first < last ) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp ;
            first++;
            last--;
        }
    }

    public static void main(String[] args) 
    {
        int number [] = {12,15,32,98,65,43};
        reverseArray(number);
        for(int i= 0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
}
