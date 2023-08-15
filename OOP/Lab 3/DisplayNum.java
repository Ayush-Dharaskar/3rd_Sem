package Lab3;

class DisplayNum {
    public static void main(String args[]) {
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
            }
            n++;
            System.out.println();
        }
        System.out.println("*********************************************************");
        n = 1;
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i : arr) {

            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
            }
            n++;
            System.out.println();
        }

    }
}
