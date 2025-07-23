package Linearsearch;
public class linearsearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target= 18;
        int ans = search(nums,target);
        System.out.println(ans);
        System.out.println(search2(nums,target));
    }
        static int search(int[] arr, int target){
            if(arr.length == 0){
                return -1;
            }
            for(int i=0;i<arr.length;i++){
                if(target == arr[i]){
                    return i;
                }
            }
            return -1;
        }

        static boolean search2 (int[] arr,int target){
            if (arr.length ==0){
                return false;
            }
            for (int i : arr) {
                if (target == i){
                    return true;
                }
            }
            return false;
        }
}
