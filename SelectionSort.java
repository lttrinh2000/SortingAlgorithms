public class SelectionSort {

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static void secSort(int[] a) {
        int min = Integer.MAX_VALUE;
        
        for (int i=0; i<a.length; i++) {
            for (int j=i; j<a.length; j++) {
                if (a[j] < min)
                    min = a[j];
                
                if (min < a[i]) {
                    swap(a,i,j);
                }
            }
            min = Integer.MAX_VALUE;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{38, 27, 43, 3, 9, 82, 10, -1};

        System.out.println("Before Sort: ");
        for (int i : a)
            System.out.print(i + " ");
        System.out.println("\n");

        secSort(a);

        System.out.println("After Sort: ");
        for (int i : a)
            System.out.print(i + " ");
        System.out.println("\n");
    }
}