package at.fhj.itm;
/**
 * Create a two-dimensional point
 * @author Manuel Eder
 *
 */
class Point2d {
	private boolean debug;
	private double x;
	private double y;

	/**
	 *  Create a new point with 2 params
	 * @param px	x-param
	 * @param py	y-param
	 */
	public Point2d (double px, double py)
	{ 
		this.x = px;
		this.y = py;
	}

	/**
	 *  Create a point with 0/0
	 */
	public Point2d () 
	{		
		// just create a point of 0/0
		x = 0;
		y = 0;
	}

	/**
	 * Create a point with another points coordinates
	 * @param pt	the point you want to use its coordinates
	 */
	public Point2d (Point2d pt) 
	{	
		x = pt.getX();
		y = pt.getY();
	}

	/**
	 * give out some debugging informations, debug needs to be set
	 * @param s	the string to be printed
	 */
	public void dprint (String s) 
	{
		if (debug)
			System.out.println("Debug: " + s);
	}
	
	/**
	 * to set the debug mode on
	 * @param b		true to set debug on
	 */
	public void setDebug (boolean b) 
	{
		if(b) this.debug = true;
		else this.debug = false;
	}

	/**
	 * to set the x-position
	 * @param px	double, the new x-position
	 */
	public void setX(double px) 
	{
		dprint ("setX(): Changing value of X from " + x + " to " + px );
		this.x = px;
	}

	/**
	 * getter of x
	 * @return	double
	 */
	public double getX() 
	{
		return x;
	}

	/**
	 * to set the y-position
	 * @param py	double, the new y-position
	 */
	public void setY(double py)  {
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
		this.y = py;
	}

	/**
	 * getter of y
	 * @return	double
	 */
	public double getY() 
	{
		return y;
	}

	/**
	 * to set the x and y-position
	 * @param px	double, the new x-position
	 * @param py	double, the new y-position
	 */
	public void setXY(double px, double py) 
	{
		this.x = px;
		this.y = py;
	}

	/**
	 * Do get the distance between two points
	 * @param pt	one of the points
	 * @return		double, distance between points
	 */
	public double distanceFrom (Point2d pt) 
	{
		double kath1 = pt.getX() - this.x;
		double kath2 = pt.getY() - this.y;
	
		return Math.sqrt((kath1*kath1)+(kath2*kath2));
	}

	/**
	 * Do get the distance between the point and 0/0
	 * @return 	double, distance between point and 0/0
	 */
	public double distanceFromOrigin () 
	{
		double kath1 = this.x;
		double kath2 = this.y;
	
		return Math.sqrt((kath1*kath1)+(kath2*kath2));
	}

	/**
	 * to get the coordinates in a string
	 * @return the coordinates
	 */
	public String toString() 
	{
		return "(" + x + "|" + y + ")";
	}
}

