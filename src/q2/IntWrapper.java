package q2;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author Deric
 *
 */
public class IntWrapper {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        //declare variables
        Integer myInteger;
        
        String firstInt;
        String secondInt;

        //input for part 1
        Scanner scan = new Scanner(System.in);
        System.out.print ("What is your integer?: ");
        myInteger = new Integer(scan.next());
        
        //output for part 1
        System.out.println();
        System.out.print ("The binary representation of your integer is: ");
        System.out.println (Integer.toBinaryString(myInteger.intValue()));
        System.out.print ("The Octal representation of your integer is: ");
        System.out.println (Integer.toOctalString(myInteger.intValue()));
        System.out.print ("The Hex representation of your integer is: ");
        System.out.println (Integer.toHexString(myInteger.intValue()));
        
        //output for part2
        System.out.println();
        System.out.print ("The MAX_VALUE for the Integer object is: ");
        System.out.println (Integer.MAX_VALUE);
        System.out.print ("The MIN_VALUE for the Integer object is: ");
        System.out.println (Integer.MIN_VALUE);
        
        //input for 3rd part
        System.out.println();
        System.out.print ("What is your first int?: ");
        firstInt = scan.next();
        System.out.print ("What is your second int?: ");
        secondInt = scan.next();
        System.out.println();
        
        //output for part 3
        System.out.print("The sum of the ints is: ");
        System.out.println(Integer.parseInt(firstInt)+ Integer.parseInt(secondInt));
         
    }
}
