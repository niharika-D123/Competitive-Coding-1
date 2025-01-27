public class Problem1 {
    public static int findMissingElement() {
        int[] arr = new int[]{1,2,3,4,6,7,8};
        int length = arr.length;

        int low = 0; int high = length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid == 0 || arr[mid] - 1 != arr[mid - 1]) {
                return mid - 2;
            }
            else if (mid == length - 1 || arr[mid] + 1 != arr[mid + 1]) {
                return mid + 2;
            }
            else if (mid == 0 || arr[mid] == mid + 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main() {
        System.out.println(findMissingElement());
    }
}
