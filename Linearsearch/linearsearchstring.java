package Linearsearch;
import java.util.Arrays;

public class linearsearchstring {
    public static void main(String[] args) {
        String name = "Dhrupad";
        char target = 'd';
        System.out.println(lsearchstring(name,target));
        System.out.println(lsearchstring2(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static int lsearchstring(String name,char target){
        if(name.toCharArray().length ==0){
            return -1;
        }
        for(int i =0;i<name.toCharArray().length;i++){
          if(target == name.charAt(i) ) {
            return i;
          } 
        }
        return -1;
    }
    static boolean lsearchstring2(String name,char target){
            if(name.toCharArray().length ==0){
            return false;
        }
        for (char i : name.toCharArray()) {
            if(i == target){
                return true;
            }
        }
        return false;
    }
}
