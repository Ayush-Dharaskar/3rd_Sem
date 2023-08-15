package Lab3;

public class ArraySearch {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 1, 2, 1, 5, 6, 7 };
        int key = 1, it = 0;

        System.out.print("The value is found in location:");
        for (int i : arr) {

            if (i == key) {
                System.out.print("a[" + it + "],");
            }
            it++;
        }
    }

}
