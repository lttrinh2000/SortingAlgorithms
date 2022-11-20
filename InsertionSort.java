public class InsertionSort {
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void inSort(int[] a) {
        for (int i=0; i<a.length-1; i++) {
            if (a[i] > a[i+1]) {
                swap(a, i, i+1);
            }
            for (int j=i; j>0; j--) {
                if (a[j] < a[j-1]) {
                    swap(a, j, j-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{38, 27, 43, 3, 9, 82, 10, -1};

        System.out.println("Before Sort: ");
        for (int i : a)
            System.out.print(i + " ");
        System.out.println("\n");
        
        inSort(a);

        System.out.println("After Sort: ");
        for (int i : a)
            System.out.print(i + " ");
        System.out.println("\n");

    }
}
