// You are using Java
import java.util.*;
class chandu{
    static boolean isPal(int n){
        int rev = 0;
        int temp = n;
        while(temp!=0){
            int ld = temp%10;
            rev = rev*10 + ld;
            temp = temp/10;
        }
        return (rev == n);
        
        }    
        public static void main(String[] args){
            int n = 193873;
            System.out.println(isPal(n));
        }
    }



// Time Complexity = Theta(d) : where d is number digits
