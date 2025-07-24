public class maxwealth {
    public static void main(String[] args) {
    int[][] accounts = {{1,2,1,100},{6,8,7,2},{8,52}};  
    System.out.println(maxwealth(accounts));
    }
    static int maxwealth(int[][]accounts){
        int amir = Integer.MIN_VALUE;
        for(int person = 0;person< accounts.length; person++){
          int sum = 0; 
          for(int i=0; i < accounts[person].length;i++){
            sum += accounts[person][i];
          } 
          if(sum > amir){
            amir = sum;
          }
        }
        
        return amir;
    }
}
