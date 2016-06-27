package at.fhj.itm;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

public class StringQueueTest 
{
	 private Point2d pt;
	    
	 	/**
	 	 * Inits a new point2d
	 	 */
	    @Before
	    public void setup() throws Exception
	    {
	        pt = new Point2d(); 
	    }
	    
	    /**
	     * tests if you can set the x coordinate of a point
	     */
	    @Test
	    public void testSetX() throws Exception
	    {
	    	pt.setX(5.0);
	    	assertEquals(5.0, pt.getX(), 0.000001);
	    }
	    
	    /**
	     * tests if you can set the x coordinate of a point
	     */
	    @Test
	    public void testSetY() throws Exception
	    {
	    	pt.setY(5.0);
	    	assertEquals(5.0, pt.getY(), 0.000001);
	    }
	    
	    /**
	     * tests if you can set the x and y coordinate of a point
	     */
	    @Test
	    public void testSetXY() throws Exception
	    {
	    	pt.setXY(3.0, 5.0);
	    	
	    	assertEquals(3.0, pt.getX(), 0.000001);
	    	assertEquals(5.0, pt.getY(), 0.000001);
	    }
	    
	    /**
	     * tests if it calculates the distance correctly between two points
	     */
	    @Test
	    public void testDistanceFrom() throws Exception
	    {
	    	pt.setXY(3.0,5.0);
	    	Point2d pt2 = new Point2d();
	    	
	    	double kath1 = pt.getX() - pt2.getX();
			double kath2 = pt.getY() - pt2.getY();
		
			double erg = Math.sqrt((kath1*kath1)+(kath2*kath2));
	    	
	    	
	    	assertEquals(erg, pt.distanceFrom(pt2), 0.000001);
	    }
	    
	    
	    /**
	     * tests if it calculates the distance correctly between one point and the origin
	     */
	    @Test
	    public void testDistanceFromOrigin() throws Exception
	    {
	    	pt.setXY(3.0,5.0);
	    	
	    	double kath1 = pt.getX();
			double kath2 = pt.getY();
		
			double erg = Math.sqrt((kath1*kath1)+(kath2*kath2));
	    	
	    	
	    	assertEquals(erg, pt.distanceFromOrigin(), 0.000001);
	    }
	    
	  
	    
}
