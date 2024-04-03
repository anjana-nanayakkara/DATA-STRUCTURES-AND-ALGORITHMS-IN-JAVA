public class ArrayInsertion {
    public static void main(String[] args){
        int arr[] = new int[15];

        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 8;
        arr[4] = 5;

        int size = 5;
        int value = 10;
        int pos = 2;

//        print array before insertion
        System.out.print("\n\n");

        System.out.print("Before Insertion: ");

        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n\n");



//      print array before insertion

        insertElement(arr,size,value,pos);
        size+=1;

        System.out.print("After Insertion: ");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n\n");


    }

    private static int[] insertElement(int[] arr, int size, int value, int pos) {

        for (int i = size-1; i>=pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos] = value;
        return arr;
    }
}
