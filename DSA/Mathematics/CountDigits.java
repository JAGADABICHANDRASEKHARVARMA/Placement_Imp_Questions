// recursive method

// You are using Java
import java.util.*;
class chandu{
    static int countDigits(long n){
        if(n==0){
            return 0;
        }
        return 1+countDigits(n/10);
        
        }    
        public static void main(String[] args){
            long n = 193873;
            System.out.println(countDigits(n));
        }
    }

