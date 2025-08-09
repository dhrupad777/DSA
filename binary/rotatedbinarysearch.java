public class rotatedbinarysearch {
    public static void main(String[] args) {
        int[] arr1 = {4,5,6,7,8,9,1,2,3};   // No duplicates
        int[] arr2 = {2,5,6,0,0,1,2};       // With duplicates
        int[] arr3 = {1,0,1,1,1};           // Many duplicates
        
        System.out.println("Pivot in arr1: " + findPivot(arr1)); // Should be 5 (element 9)
        System.out.println("Pivot in arr2: " + findPivot(arr2)); // Should be 2 (element 6)  
        System.out.println("Pivot in arr3: " + findPivot(arr3)); // Should be 0 (element 1)
        
        // Test search
        System.out.println("Search 0 in arr2: " + search(arr2, 0)); // Should find 0
        System.out.println("Search 3 in arr1: " + search(arr1, 3)); // Should find 3
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        
        // If no rotation found, do normal binary search
        if (pivot == -1) {
            return bsearch(arr, target, 0, arr.length - 1);
        }
        
        // If pivot element is target
        if (arr[pivot] == target) {
            return pivot;
        }
        
        // Decide which half to search
        if (target >= arr[0]) {
            return bsearch(arr, target, 0, pivot - 1);
        }
        
        return bsearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int bsearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    
    static int findPivot(int[] arr) {
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