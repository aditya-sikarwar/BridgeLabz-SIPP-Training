public class BinarySearchProb2{
    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; // or arr[left] for the peak value
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(findPeakElement(arr)); 
    }
}
