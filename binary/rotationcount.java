public class rotationcount {
    public static void main(String[] args) {
    int[] arr = {7,8,9,9,1,2,3,4,5,6};
    int ans = findpivot(arr) +1   ;
    System.out.println(ans);
    }
    static int findpivot(int[] arr){
     int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Handle duplicates first - this is crucial
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // Skip duplicates from both ends
                // But check if start or end might be pivot
                if (start < arr.length - 1 && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                
                if (end > 0 && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
                continue;
            }
            
            // Case 1: mid is greater than next element (pivot found)
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            
            // Case 2: mid is smaller than previous element (pivot is previous)
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            
            // Case 3: Left half is sorted, pivot is in right half
            if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } 
            // Case 4: Right half is sorted, pivot is in left half
            else {
                end = mid - 1;
            }
        }
        
        return -1; // Array is not rotated   
    }
}
