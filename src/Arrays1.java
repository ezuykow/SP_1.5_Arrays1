public class Arrays1 {
    @SuppressWarnings("ConstantConditions")
    public static void main(String[] args) {

//        Task 1
        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }

        double[] arr2 = {1.57, 7.654, 9.986};

        boolean[] arr3 = {true, false};

//        Task 2
        System.out.println("\nTask 2:");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr1.length-1; i++) {
            result.append(arr1[i]).append(", ");
        }
        result.append(arr1[arr1.length-1]).append("\n");

        for (int i = 0; i < arr2.length-1; i++) {
            result.append(arr2[i]).append(", ");
        }
        result.append(arr2[arr2.length-1]).append("\n");

        for (int i = 0; i < arr3.length-1; i++) {
            result.append(arr3[i]).append(", ");
        }
        result.append(arr3[arr3.length-1]);

        System.out.println(result);

//        Task 3
        System.out.println("\nTask 3:");

        result.setLength(0);

        for (int i = arr1.length - 1; i > 0; i--) {
            result.append(arr1[i]).append(", ");
        }
        result.append(arr1[0]).append("\n");

        for (int i = arr2.length - 1; i > 0; i--) {
            result.append(arr2[i]).append(", ");
        }
        result.append(arr2[0]).append("\n");

        for (int i = arr3.length - 1; i > 0; i--) {
            result.append(arr3[i]).append(", ");
        }
        result.append(arr3[0]);

        System.out.println(result);

//        Task 4
        System.out.println("\nTask 4:");

        for (int i : arr1) {
            i = i % 2 == 0 ? i : i+1;
            System.out.print(i + " ");
        }
    }
}
