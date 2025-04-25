import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Solution here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Solution
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Solution
     */
    public Solution()
    {
        // initialise instance variables
        x = 0;
        
        
        ArrayList<Double> temperatures = new ArrayList<Double>();
        temperatures.add(34.5);
        temperatures.add(39.5);
        temperatures.add(44.5);
        temperatures.add(24.5);
        temperatures.add(44.5);
        temperatures.add(38.5);
        
        feverTest(temperatures);
    }
    //quesation 25
    public void feverTest(ArrayList<Double> temperatures){
        int count = 0;
        double max = 0;
        for (Double temp : temperatures) {        
            if (temp > 37.5) {
                count++;
            }
            if (temp > max) {
                max = temp;
            }
        }
        
        System.out.println("Number of fever cases reported:" + count);
        System.out.println("Higher fever case:" + max);
        
        //question 26 - using Collections.max
        System.out.println("Higher fever case (Collections.max):" + Collections.max(temperatures));
        //question 27
        Collections.sort(temperatures);
        System.out.println("Higher fever case (Collections.sort):" + temperatures.get(temperatures.size()-1));
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod()
    {
       //question 24
       String c = "car";
       String b = "bus";
       if (c.equals(b)){
           System.out.println("they are equal");
           
       }
       else {
           System.out.println("they are not equal");;
        }
      
    }
}
/*
 * question 25
 * public double feverTest(int ArrayList<>(), maxTemp int) {
 *     for (value() > 37.5; i++) {
 *         System.out.println("is fever");
 *         }
 *     while (value() > size())
 *         return maxTemp 
 *         }
 }
 }
 * 
 * 
 * 
 * 
 * 
 * 
 */


