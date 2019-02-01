package com.mycompany.app;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
	public static boolean search(ArrayList<Integer> array, int x, int y) {
    	String xx = Integer.toString(x);
		String yy= Integer.toString(y);
		if(xx== null || yy==null) return false;
	     if (array == null) return false;
	      
		 else if(array!=null){ for (int elt : array) {
	          if (elt == x ) return true;		  
		 
	        }
	      for (int elt : array) {
	          
	      if(elt == y) return true;
		 
	        }
		 }
	      return false;
	     
	    }

	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
