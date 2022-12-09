package Exercise4;

//Program to copy all elements of one array into another array
public class Example1 {

    public static void main(String[] args) {

        int[] arr1 = new int []{1, 2, 3, 4, 5};
        int[] arr2 = new int [arr1.length];
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }

        System.out.print("Elements of original array is ");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + ", ");
        }

        System.out.print("\nElements of second array is ");
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + ", ");
        }
    }
}
