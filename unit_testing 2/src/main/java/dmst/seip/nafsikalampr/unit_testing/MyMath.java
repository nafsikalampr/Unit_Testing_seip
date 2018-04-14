package dmst.seip.nafsikalampr.unit_testing;


/**
 * Hello world!
 *
 */
public class MyMath 
{
    
    public double divide(int num, int denom) {
    	    if (denom == 0) {
    	    	    throw new IllegalArgumentException("Denom has to be other than 0");
    	    }
    	    return (double) num / denom;
    	    
    }
    
    	//@param number the input number 
   	// @return a number with reversed sign
   	public int reverseNumber(int number) {
   		if(number != 0) {
   		    return -number;
   		}else {
   			return 0;
   		}
   	}
}
