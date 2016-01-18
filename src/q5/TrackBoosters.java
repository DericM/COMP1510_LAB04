package q5;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author Deric
 *
 */
public class TrackBoosters {

    /**
     * @param args
     */
    public static void main(String[] args) {
        BandBooster booster1;
        BandBooster booster2;
        
        //input names for boosters
        Scanner scan = new Scanner(System.in);
        System.out.print ("What is the name for booster1?: ");
        booster1 = new BandBooster(scan.nextLine());
        
        System.out.print ("What is the name for booster2?: ");
        booster2 = new BandBooster(scan.nextLine());
        
        //enter sales for week1
        System.out.print ("Enter the number of boxes sold by " + booster1.getName() + " in week one.");
        booster1.updateSales(scan.nextInt());
        
        System.out.print ("Enter the number of boxes sold by " + booster2.getName() + " in week one.");
        booster2.updateSales(scan.nextInt());
        
        //week2
        System.out.print ("Enter the number of boxes sold by " + booster1.getName() + " in week two.");
        booster1.updateSales(scan.nextInt());
        
        System.out.print ("Enter the number of boxes sold by " + booster2.getName() + " in week two.");
        booster2.updateSales(scan.nextInt());
        
        //week3
        System.out.print ("Enter the number of boxes sold by " + booster1.getName() + " in week three.");
        booster1.updateSales(scan.nextInt());
        
        System.out.print ("Enter the number of boxes sold by " + booster2.getName() + " in week three.");
        booster2.updateSales(scan.nextInt());
        
        scan.close();
        
        //print name and total sales
        System.out.println (booster1.toString());
        System.out.println (booster2.toString());

    }

}
