public class LinearSearch {
    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        // Function call
        int result = linearSearch(arr, arr.length, x);
        if (result == -1) {
            System.out.print("\n\nElement is not present in array");
        }
        else {
            System.out.print("\n\nElement is present at index " + result);
        }
        System.out.println();
    }

    private static int linearSearch(int[] arr, int length, int x) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}
