package Concept_and_Syntax;
// this multiple line comment is used for documentation
/****
 * <h1>User class</h1>
 * <p>This class is used for creating user object</p>
 * <img width="100" height="100" src="https://cdn.britannica.com/61/74061-050-47B62C0E/computer-peripherals-images-laser-printer-inkjet-layout.jpg"/>
 * @author Kim Chansokpheng
 * @version 1.0
 */

public class Convert_dataType {
    public static void main(String[] args) {
        // promotion
        int avg = 2;
        double newAvg = avg;
        // casting
        double price = 55.5;
        int singlePrice = (int) price;
        // auto-boxing
        int primitive = 100;
        Integer newWrapper = primitive;
        // unboxing
        Double doubleOfWrapper = 45.5;
        double primitiveDouble = doubleOfWrapper;
    }
}
