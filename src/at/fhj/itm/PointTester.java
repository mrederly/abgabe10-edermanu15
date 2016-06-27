package at.fhj.itm;

class PointTester {
	public static void main(String[] args)
	{
		
		String p1p = args[0].toString();
		String p2p = args[1].toString();
		String p3p = args[2].toString();
		String p4p = args[3].toString();
		
		int x1 = Integer.parseInt(p1p);
		int y1 = Integer.parseInt(p2p);
		int x2 = Integer.parseInt(p3p);
		int y2 = Integer.parseInt(p4p);

		Point2d point1 = new Point2d(x1, y1);
		Point2d point2 = new Point2d(x2, y2);


		System.out.println("Distance from " + point1 + " to " +  point2 + " is " + point1.distanceFrom(point2));
	}
}
