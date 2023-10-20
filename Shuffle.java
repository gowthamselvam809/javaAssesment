import java.util.Arrays;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        shuffleArray(arr);


        //inBuilt Arrays Object function for printing the array
        System.out.println(Arrays.toString(arr));


        //manual method to print an array
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    public static void shuffleArray(int[] arr){
        int n = arr.length;
        Random random = new Random();
        for (int i = 0; i < n ; i++) {
            int j = random.nextInt(n);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
