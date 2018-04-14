package dmst.seip.nafsikalampr.unit_testing;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MyFileUtilities {
    public int[] readFile(String filepath) throws IllegalArgumentException {
    	  
    	    ArrayList<Integer> integers = new ArrayList<Integer>();
    	    
    	    try {
    	       BufferedReader br = new BufferedReader(new FileReader(filepath));
    	       while(br.readLine()!= null){
    	    	   //reading and adding elements to list
    	          integers.add(Integer.parseInt(br.readLine()));
    	       }
    	       br.close();
    	    }catch(Exception ex){
    		   throw new IllegalArgumentException("error reading filepath" +ex.getMessage());
    	    }
    	    //converting from list to array
    	    int[] result = new int[integers.size()];
    	    for (int i=0; i<integers.size(); i++) {
    	    	   result[i] = integers.get(i);
    	    }
    	    return result;
    }
}
