package servitant.task;

public class swapValues {
    public static void swapValues1(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int num1 = 5, num2 = 9;
        int[] arr = {num1, num2};
        System.out.println("Before swapping: " + arr[0] + ", " + arr[1]);
        swapValues1(arr, 0, 1);
        System.out.println("After swapping: " + arr[0] + ", " + arr[1]);
    }
}
