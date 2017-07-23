import java.util.Scanner;

public class Solution {

    static int[] getRecord(int[] s) {
        // Complete this function
        int[] results = new int[]{0, 0};
        int high = s[0];
        int low = s[0];

        for (int value : s) {
            if (value > high) {
                results[0]++;
                high = value;
            }
            if (value < low) {
                results[1]++;
                low = value;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
