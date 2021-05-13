package z10;

public class 45a {
    public static void main(String[] args) {
        int a[] = {{8,1,6,5},{3,7,3},{4,9}};
        int[] b = selectMaxToMinSort(a);
        for (int value : b) {
            System.out.print(value + " ");
        }
    }
 
    public static int[] selectMinToMaxSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int temp = 9999;
            int index = 0;
            for (int j = i; j < input.length; j++) {
                if (temp > input[j]) {
                    temp = input[j];
                    index = j;
                }
            }
            if (index != 0) {
                int t = input[index];
                input[index] = input[i];
                input[i] = t;
            }
        }
        return input;
    }
 
    public static int[] selectMaxToMinSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int temp = -9999;
            int index = 0;
            for (int j = i; j < input.length; j++) {
                if (temp < input[j]) {
                    temp = input[j];
                    index = j;
                }
            }
            if (index != 0) {
                int t = input[index];
                input[index] = input[i];
                input[i] = t;
            }
        }
        return input;
    }
}