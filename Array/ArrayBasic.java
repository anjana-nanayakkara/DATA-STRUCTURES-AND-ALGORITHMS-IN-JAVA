public class ArrayBasic {
    public static void main(String[] args){
        //initializing

        int arr1[] = {1,2,3};

        int arr2[];
        arr2=new int[5];

        arr2[3] = 5;

        System.out.println(arr1[2]);

        System.out.println(arr2[3]);
        System.out.println(arr2[2]);
        System.out.println(arr2[4]);

//        print array values

        for (int i = 0; i<3; i++){
            System.out.println(arr1[i]);
        }

//        update array values

        System.out.println(arr1[1]);
        arr1[1]=34;
        System.out.println(arr1[1]);


    }
}
