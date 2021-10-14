import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
       
        try{
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println(x/y);
        }catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
    }
}
