public class ArrayElementDelete {

    public static void main(String args[])
    {
        int i;
        int arr[] = { 10, 50, 30, 40, 20 };

        int size = arr.length;
        int key = 30;

        System.out.println("Array before deletion");
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        // Function call
        size = deleteElement(arr, size, key);

        System.out.println("\n\nArray after deletion");
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    private static int deleteElement(int[] arr, int size, int key) {
        int pos = findElement(arr, size, key);

        if (pos == -1) {
            System.out.println("Element not found");
            return size;
        }

        // Deleting element
        int i;
        for (i = pos; i < size - 1; i++)
            arr[i] = arr[i + 1];

        return size - 1;
    }

    private static int findElement(int[] arr, int size, int key) {
        int i;
        for (i = 0; i < size; i++)
            if (arr[i] == key)
                return i;

        return -1;
    }
}
