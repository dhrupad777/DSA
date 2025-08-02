public class binaryfloor {
      public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,77,88,99,555,999};
        int target= 0000;
        System.out.println(bsearch(nums,target));
    }
    static int bsearch(int[] arr,int target){
        if(target < arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

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

        return arr[end];
    }  
}
