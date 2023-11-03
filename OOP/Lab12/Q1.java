import java.util.*;

class swapp<T>{

    void swap(T[] arr,int a,int b)
    {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4,5};
        System.out.println("Before swapping:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        swapp<Integer> test = new swapp<Integer>();
        test.swap(arr,2,4);

        System.out.println("After swapping:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
