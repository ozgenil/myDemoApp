package com.mycompany.app;


import java.util.ArrayList;
import java.util.Arrays;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testFoundOneofThem() {
		 ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 9));
	      new App();
		assertTrue(App.search(array, 5,1,6));
	    }
	 public void testFoundBoth(){
		 ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	      new App();
		assertTrue(App.search(array, 4,1,2));
	 }
	    public void testNotFound() {
	    	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	      new App();
		assertFalse(App.search(array, 5,6,7));
	    }

	    public void testEmptyArray() {
	    	ArrayList<Integer> array = new ArrayList<>();
	      new App();
		assertFalse(App.search(array, 1,2,3));
	    }
	    public void testNull(){
	    	new App();
			assertFalse(App.search(null, 1,2,3));
	    }
}
