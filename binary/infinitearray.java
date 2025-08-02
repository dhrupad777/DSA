public class infinitearray{
    public static void main(String[] args) {

     int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,11,15,200};
     int number = 9;
     System.out.println(ans(arr,number));   
    }
    public static int ans(int[]arr , int number){
        int start = 0;
        int end = 1;
        while(number > arr[end]){
            int newStart = end +1;
            end = end + ((end - start +1) * 2);
            start = newStart;
        }
        return bsearch(arr, number, start, end);
    }

    
        static int bsearch(int[] arr,int target, int start , int end){
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
}