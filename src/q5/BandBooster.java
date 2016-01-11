package q5;

public class BandBooster {
    private String name; 
    private int boxesSold; 
    // --------------------------------------------
    //Constructor -- 
    // -------------------------------------------
    public BandBooster(String boosterName) {
        name = boosterName; 
        boxesSold = 0;
    }
    public String getName() {
        return name; 
    } 
    public void updateSales(int newSales) {
        boxesSold += newSales; 
    } 
    public String toString() {
        return "" + name + ": " + boxesSold + " Boxes";
    }
}
