public class searchinmountain {
    public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7,4,3,2,1};
    System.out.println(findInMountainArray(5,nums));
    }



    public static int findInMountainArray(int target, int[] arr) {
        int peak =  peakIndexInMountainArray(arr);
        int firstTry = bsearch(arr, target, 0, peak);

        if( firstTry != -1){
            return firstTry;
        }
        int secondTry = bsearchrev(arr, target, peak, arr.length -1);
        return secondTry;
    }



    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
            while(start!=end){
            int mid = start + (end - start)/2;
            if(arr[mid +1] < arr[mid]){
                end = mid ;
            }
            else if(arr[mid+1] > arr[mid]){
                start = mid +1 ;
            }
            else {return mid;} 
        }

        return start;
        
    }

        static int bsearch(int[] arr,int target, int start, int end){
        // int start = 0;
        // int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else {return mid;} 
        }

        return -1;
    }

            static int bsearchrev(int[] arr,int target, int start, int end){
        // int start = 0;
        // int end = arr.length-1;
        boolean isAsc = arr[start]< arr[end];

        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            };
            if(isAsc){
            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }

            }
            else {
            if(target > arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }

            }

            
        }

        return -1;
    }
}
