import java.util.Scanner;
public class ThreeSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[7]; 
        System.out.println("Enter 7 numbers:");
        for (int i = 0; i < 7; i++) {
            arr[i] = scan.nextInt();
        }
        if (isSumFound(arr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static boolean isSumFound(int[] arr) {
        int last = arr[6];
        return check(arr, 0, 0, 0, last); 
    }
    public static boolean check(int[] arr, int pos, int count, int total, int target) {
        if (count == 3) {
            return total == target;
        }
        if (pos >= 6) {
            return false;
        }
        boolean include = check(arr, pos + 1, count + 1, total + arr[pos], target);
        boolean skip = check(arr, pos + 1, count, total, target);
        return include || skip;
    }
}
