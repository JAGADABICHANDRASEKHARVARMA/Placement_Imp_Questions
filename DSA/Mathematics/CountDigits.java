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



//Iterative Solution
// You are using Java
import java.util.*;
class chandu{
    static int countDigits(long n){
        int count = 0;
        while(n!=0){
            n = n/10;
            ++count;
        }
        return count;
        
        }    
        public static void main(String[] args){
            long n = 193873;
            System.out.println(countDigits(n));
        }
    }


// Time complexity = Theta(d)  : where d is the number of digits. 
// where are checking all the digits so it will take Theta(d) time.
