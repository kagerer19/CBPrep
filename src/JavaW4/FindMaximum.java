package JavaW4;
public class FindMaximum {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 72, 6, 5, 4, 3, 2, 900, 44, 56, 2352, 25};
        System.out.println("Maximum number: " + findMaxNum(arr, 0, arr.length - 1));
    }

    public static int findMaxNum(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        }

        int mid = start + (end - start) / 2;

        int maxStart = findMaxNum(arr, start, mid);
        int maxEnd = findMaxNum(arr, mid + 1, end);

        return Math.max(maxStart, maxEnd);
    }
}
