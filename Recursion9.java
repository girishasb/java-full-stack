public class Recursion9 {
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {// base cond^nhy
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {// strictly increasing (not even same number always greater number)
            // array is sorted till now
            return isSorted(arr, idx + 1);

        } else {
            return false;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 4, 3 };
        System.out.println(isSorted(arr, 0));

    }

}
