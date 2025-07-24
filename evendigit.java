public class evendigit {
    public static void main(String[] args) {
        int[] nums = {1,2,2,-4,7782,-63,4,-528,333};
        System.out.println(evencount(nums));
    }
    static int evencount(int[] arr){
        int e = 0;
        for(int i : arr){
            if(i<0){
                i *= -1;
            }
            
            if( evendigits(i) % 2 == 0){
            
            e++;                
            }
        }
        return e;
    }
    static int evendigits(int i){
        int count = 0;
        while (i > 0) {
            count++;
            i /= 10;
        }
        return count;
        
    }
}
