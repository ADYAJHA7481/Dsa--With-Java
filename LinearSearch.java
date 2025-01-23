public class LinearSearch {

    public static int linearSearch(int number[], int key) {
        for( int i = 0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int numbers[] = {2,3,5,1,9,6,4};
        int key = 11;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not found");
        }else {
            System.out.println("key found at index " + index);
        }
    }
}
