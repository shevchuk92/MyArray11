import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int arr[] = {5, 11, 10, 7, 9, 3, 2, 4};

    public static void main(String[] args) {

        Random random = new Random();
        int arrRD[] = new int[7];

        for (int i = 0; i < arrRD.length; i++) {
            arrRD[i] = random.nextInt(11);
        }

        MyArrays myArr = new MyArrays();

        System.out.println("Hardcode array: " + Arrays.toString(arr));
        System.out.println("Random array: " + Arrays.toString(arrRD));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Hardcode array amount: " + myArr.myArrayAmount(arr));
        System.out.println("Random array amount: " + myArr.myArrayAmount(arrRD));

        myArr.myArraySort(arr);
        myArr.myArraySort(arrRD);
        System.out.println("Hardcode array sort: " + Arrays.toString(arr));
        System.out.println("Random array sort: " + Arrays.toString(arrRD));
    }

}