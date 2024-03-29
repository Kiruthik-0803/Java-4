public class sort {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 4, 6, 3, 2, 0, 0, 2, 1, 0, 2, 1, 2 };
        int length = arr.length;
        int[] result = new int[length];
        int pos = 0;
        int val = 0;
        int max = 0;


        for (int i = 0; i < length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        while (val <= max) {
            for (int i = 0; i < length; i++) {
                if (arr[i] == val) {
                    result[pos] = arr[i];
                    pos++;
                }
            }
            val++;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(result[i]);

        }

    }
}
