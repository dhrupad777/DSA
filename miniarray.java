

public class miniarray {
    public static void main(String[] args) {
        int[] nums = {1,1,-500,50,4,5,6,-1};

        System.out.println(mini(nums));

    }
    static int mini (int[] arr) {
        int ans = arr[0];
        for(int i =0;i< arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
